pipelineJob('insertCustomerComplete') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/soulasesing/insertCustomerComplete.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}