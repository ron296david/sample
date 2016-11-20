function Get-CommitsFromGitLog([string] $StartCommit, [string] $EndCommit){
    $Cmd = "git log --pretty=format:""CommitHash=%H :: AuthorEmail=%ae :: AuthorDate=%ad :: Subject=%s"" $StartCommit $EndCommit"
    #$Cmd = "git log Subject=%s"" $StartCommit...$EndCommit"
 
    $Result = Invoke-Expression $Cmd
    $ParsedResult = $Result | %{ ConvertFrom-StringData($_ -replace " :: ", "`n")  }
	Write-Output $ParsedResult
    return $ParsedResult
}