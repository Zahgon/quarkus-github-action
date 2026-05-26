package io.quarkiverse.githubaction.runtime;

import io.quarkiverse.githubaction.Context;

class ContextImpl implements Context {

    private final String home;

    private final String gitHubAction;

    private final String gitHubActionPath;

    private final String gitHubActor;

    private final String gitHubActorId;

    private final String gitHubApiUrl;

    private final String gitHubBaseRef;

    private final String gitHubEnv;

    private final String gitHubEventName;

    private final String gitHubEventPath;

    private final String githubGraphQLUrl;

    private final String gitHubHeadRef;

    private final String gitHubJob;

    private final String gitHubOutput;

    private final String gitHubPath;

    private final String gitHubRef;

    private final String gitHubRefName;

    private final String gitHubRefProtected;

    private final String gitHubRefType;

    private final String gitHubRepository;

    private final String gitHubRepositoryId;

    private final String gitHubRepositoryOwner;

    private final String gitHubRepositoryOwnerId;

    private final String gitHubRetentionDays;

    private final String gitHubRunAttempt;

    private final String gitHubRunId;

    private final String gitHubRunNumber;

    private final String gitHubServerUrl;

    private final String gitHubSha;

    private final String gitHubStepSummary;

    private final String gitHubTriggeringActor;

    private final String gitHubWorkflow;

    private final String gitHubWorkflowRef;

    private final String gitHubWorkflowSha;

    private final String gitHubWorkspace;

    private final String runnerArch;

    private final String runnerDebug;

    private final String runnerName;

    private final String runnerOs;

    private final String runnerTemp;

    private final String runnerToolCache;

    private final String runnerWorkspace;

    ContextImpl() {
        home = System.getenv("HOME");
        gitHubActionPath = System.getenv("GITHUB_ACTION_PATH");
        gitHubAction = System.getenv("GITHUB_ACTION");
        gitHubActor = System.getenv("GITHUB_ACTOR");
        gitHubActorId = System.getenv("GITHUB_ACTOR_ID");
        gitHubApiUrl = System.getenv("GITHUB_API_URL");
        gitHubBaseRef = System.getenv("GITHUB_BASE_REF");
        gitHubEnv = System.getenv("GITHUB_ENV");
        gitHubEventName = System.getenv("GITHUB_EVENT_NAME");
        gitHubEventPath = System.getenv("GITHUB_EVENT_PATH");
        githubGraphQLUrl = System.getenv("GITHUB_GRAPHQL_URL");
        gitHubHeadRef = System.getenv("GITHUB_HEAD_REF");
        gitHubJob = System.getenv("GITHUB_JOB");
        gitHubOutput = System.getenv("GITHUB_OUTPUT");
        gitHubPath = System.getenv("GITHUB_PATH");
        gitHubRefName = System.getenv("GITHUB_REF_NAME");
        gitHubRefProtected = System.getenv("GITHUB_REF_PROTECTED");
        gitHubRef = System.getenv("GITHUB_REF");
        gitHubRefType = System.getenv("GITHUB_REF_TYPE");
        gitHubRepository = System.getenv("GITHUB_REPOSITORY");
        gitHubRepositoryId = System.getenv("GITHUB_REPOSITORY_ID");
        gitHubRepositoryOwner = System.getenv("GITHUB_REPOSITORY_OWNER");
        gitHubRepositoryOwnerId = System.getenv("GITHUB_REPOSITORY_OWNER_ID");
        gitHubRetentionDays = System.getenv("GITHUB_RETENTION_DAYS");
        gitHubRunAttempt = System.getenv("GITHUB_RUN_ATTEMPT");
        gitHubRunId = System.getenv("GITHUB_RUN_ID");
        gitHubRunNumber = System.getenv("GITHUB_RUN_NUMBER");
        gitHubServerUrl = System.getenv("GITHUB_SERVER_URL");
        gitHubSha = System.getenv("GITHUB_SHA");
        gitHubStepSummary = System.getenv("GITHUB_STEP_SUMMARY");
        gitHubTriggeringActor = System.getenv("GITHUB_TRIGGERING_ACTOR");
        gitHubWorkflow = System.getenv("GITHUB_WORKFLOW");
        gitHubWorkflowRef = System.getenv("GITHUB_WORKFLOW_REF");
        gitHubWorkflowSha = System.getenv("GITHUB_WORKFLOW_SHA");
        gitHubWorkspace = System.getenv("GITHUB_WORKSPACE");
        runnerArch = System.getenv("RUNNER_ARCH");
        runnerDebug = System.getenv("RUNNER_DEBUG");
        runnerName = System.getenv("RUNNER_NAME");
        runnerOs = System.getenv("RUNNER_OS");
        runnerTemp = System.getenv("RUNNER_TEMP");
        runnerToolCache = System.getenv("RUNNER_TOOL_CACHE");
        runnerWorkspace = System.getenv("RUNNER_WORKSPACE");
    }

    @Override
    public String getHome() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubAction() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubActionPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubActor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Long getGitHubActorId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubApiUrl() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubBaseRef() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubEnv() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubEventName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubEventPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGithubGraphQLUrl() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubHeadRef() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubJob() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubOutput() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubRef() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubRefName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isGitHubRefProtected() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubRefType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubRepository() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Long getGitHubRepositoryId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubRepositoryOwner() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Long getGitHubRepositoryOwnerId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Integer getGitHubRetentionDays() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Integer getGitHubRunAttempt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Long getGitHubRunId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Long getGitHubRunNumber() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubServerUrl() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubSha() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubStepSummary() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubTriggeringActor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubWorkflow() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubWorkflowRef() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubWorkflowSha() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getGitHubWorkspace() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getRunnerArch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getRunnerDebug() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getRunnerName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getRunnerOs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getRunnerTemp() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getRunnerToolCache() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getRunnerWorkspace() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
