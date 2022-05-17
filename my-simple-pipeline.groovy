pipeline 'my-simple-pipeline', {
  description = 'My description'
  disableMultipleActiveRuns = '0'
  disableRestart = '0'
  enabled = '1'
  overrideWorkspace = '0'
  pipelineRunNameTemplate = null
  projectName = 'Default'
  releaseName = null
  skipStageMode = 'ENABLED'
  templatePipelineName = null
  templatePipelineProjectName = null
  type = null
  workspaceName = null

  formalParameter 'ec_stagesToRun', defaultValue: null, {
    expansionDeferred = '1'
    label = null
    orderIndex = null
    required = '0'
    type = null
  }

  stage 'Stage 2', {
    colorCode = '#289ce1'
    completionType = 'auto'
    condition = null
    duration = null
    parallelToPrevious = null
    pipelineName = 'my-simple-pipeline'
    plannedEndDate = null
    plannedStartDate = null
    precondition = null
    resourceName = null
    waitForPlannedStartDate = '0'

    gate 'PRE', {
      condition = null
      precondition = null
      }

    gate 'POST', {
      condition = null
      precondition = null
      }

    task 'hello_world', {
      description = ''
      actionLabelText = null
      actualParameter = [
        'commandToRun': 'echo "Hello World"',
        'shellToUse': 'bash',
      ]
      advancedMode = '0'
      afterLastRetry = null
      allowOutOfOrderRun = '0'
      allowSkip = null
      alwaysRun = '0'
      ciConfigurationName = null
      ciControllerFolder = null
      ciControllerName = null
      ciJobBranchName = null
      ciJobFolder = null
      ciJobName = null
      condition = null
      customLabel = null
      deployerExpression = null
      deployerRunType = null
      disableFailure = null
      duration = null
      emailConfigName = null
      enabled = '1'
      environmentName = null
      environmentProjectName = null
      environmentTemplateName = null
      environmentTemplateProjectName = null
      errorHandling = 'stopOnError'
      gateCondition = null
      gateType = null
      groupName = null
      groupRunType = null
      insertRollingDeployManualStep = '0'
      instruction = null
      notificationEnabled = null
      notificationTemplate = null
      parallelToPrevious = null
      plannedEndDate = null
      plannedStartDate = null
      precondition = null
      requiredApprovalsCount = null
      resourceName = ''
      retryCount = null
      retryInterval = null
      retryType = null
      rollingDeployEnabled = null
      rollingDeployManualStepCondition = null
      skippable = '0'
      snapshotName = null
      stageSummaryParameters = null
      startingStage = null
      subErrorHandling = null
      subapplication = null
      subpipeline = null
      subpluginKey = 'EC-Core'
      subprocedure = 'RunCommand'
      subprocess = null
      subproject = null
      subrelease = null
      subreleasePipeline = null
      subreleasePipelineProject = null
      subreleaseSuffix = null
      subworkflowDefinition = null
      subworkflowStartingState = null
      taskProcessType = null
      taskType = 'COMMAND'
      triggerType = null
      useApproverAcl = '0'
      waitForPlannedStartDate = '0'
    }
  }

  // Custom properties
  ready_for_deployment = ''
}
