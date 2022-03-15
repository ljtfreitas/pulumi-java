// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudbuild_v1.outputs.ArtifactsResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.BuildApprovalResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.BuildOptionsResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.BuildStepResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.FailureInfoResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.ResultsResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.SecretResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.SecretsResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.SourceProvenanceResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.SourceResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.WarningResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetBuildResult {
    /**
     * Describes this build's approval configuration, status, and result.
     * 
     */
    private final BuildApprovalResponse approval;
    /**
     * Artifacts produced by the build that should be uploaded upon successful completion of all build steps.
     * 
     */
    private final ArtifactsResponse artifacts;
    /**
     * Secrets and secret environment variables.
     * 
     */
    private final SecretsResponse availableSecrets;
    /**
     * The ID of the `BuildTrigger` that triggered this build, if it was triggered automatically.
     * 
     */
    private final String buildTriggerId;
    /**
     * Time at which the request to create the build was received.
     * 
     */
    private final String createTime;
    /**
     * Contains information about the build when status=FAILURE.
     * 
     */
    private final FailureInfoResponse failureInfo;
    /**
     * Time at which execution of the build was finished. The difference between finish_time and start_time is the duration of the build's execution.
     * 
     */
    private final String finishTime;
    /**
     * A list of images to be pushed upon the successful completion of all build steps. The images are pushed using the builder service account's credentials. The digests of the pushed images will be stored in the `Build` resource's results field. If any of the images fail to be pushed, the build status is marked `FAILURE`.
     * 
     */
    private final List<String> images;
    /**
     * URL to logs for this build in Google Cloud Console.
     * 
     */
    private final String logUrl;
    /**
     * Google Cloud Storage bucket where logs should be written (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
     * 
     */
    private final String logsBucket;
    /**
     * The 'Build' name with format: `projects/{project}/locations/{location}/builds/{build}`, where {build} is a unique identifier generated by the service.
     * 
     */
    private final String name;
    /**
     * Special options for this build.
     * 
     */
    private final BuildOptionsResponse options;
    /**
     * ID of the project.
     * 
     */
    private final String project;
    /**
     * TTL in queue for this build. If provided and the build is enqueued longer than this value, the build will expire and the build status will be `EXPIRED`. The TTL starts ticking from create_time.
     * 
     */
    private final String queueTtl;
    /**
     * Results of the build.
     * 
     */
    private final ResultsResponse results;
    /**
     * Secrets to decrypt using Cloud Key Management Service. Note: Secret Manager is the recommended technique for managing sensitive data with Cloud Build. Use `available_secrets` to configure builds to access secrets from Secret Manager. For instructions, see: https://cloud.google.com/cloud-build/docs/securing-builds/use-secrets
     * 
     */
    private final List<SecretResponse> secrets;
    /**
     * IAM service account whose credentials will be used at build runtime. Must be of the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. ACCOUNT can be email address or uniqueId of the service account.
     * 
     */
    private final String serviceAccount;
    /**
     * The location of the source files to build.
     * 
     */
    private final SourceResponse source;
    /**
     * A permanent fixed identifier for source.
     * 
     */
    private final SourceProvenanceResponse sourceProvenance;
    /**
     * Time at which execution of the build was started.
     * 
     */
    private final String startTime;
    /**
     * Status of the build.
     * 
     */
    private final String status;
    /**
     * Customer-readable message about the current status.
     * 
     */
    private final String statusDetail;
    /**
     * The operations to be performed on the workspace.
     * 
     */
    private final List<BuildStepResponse> steps;
    /**
     * Substitutions data for `Build` resource.
     * 
     */
    private final Map<String,String> substitutions;
    /**
     * Tags for annotation of a `Build`. These are not docker tags.
     * 
     */
    private final List<String> tags;
    /**
     * Amount of time that this build should be allowed to run, to second granularity. If this amount of time elapses, work on the build will cease and the build status will be `TIMEOUT`. `timeout` starts ticking from `startTime`. Default time is ten minutes.
     * 
     */
    private final String timeout;
    /**
     * Stores timing information for phases of the build. Valid keys are: * BUILD: time to execute all build steps. * PUSH: time to push all specified images. * FETCHSOURCE: time to fetch source. * SETUPBUILD: time to set up build. If the build does not specify source or images, these keys will not be included.
     * 
     */
    private final Map<String,String> timing;
    /**
     * Non-fatal problems encountered during the execution of the build.
     * 
     */
    private final List<WarningResponse> warnings;

    @CustomType.Constructor
    private GetBuildResult(
        @CustomType.Parameter("approval") BuildApprovalResponse approval,
        @CustomType.Parameter("artifacts") ArtifactsResponse artifacts,
        @CustomType.Parameter("availableSecrets") SecretsResponse availableSecrets,
        @CustomType.Parameter("buildTriggerId") String buildTriggerId,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("failureInfo") FailureInfoResponse failureInfo,
        @CustomType.Parameter("finishTime") String finishTime,
        @CustomType.Parameter("images") List<String> images,
        @CustomType.Parameter("logUrl") String logUrl,
        @CustomType.Parameter("logsBucket") String logsBucket,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("options") BuildOptionsResponse options,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("queueTtl") String queueTtl,
        @CustomType.Parameter("results") ResultsResponse results,
        @CustomType.Parameter("secrets") List<SecretResponse> secrets,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("source") SourceResponse source,
        @CustomType.Parameter("sourceProvenance") SourceProvenanceResponse sourceProvenance,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("statusDetail") String statusDetail,
        @CustomType.Parameter("steps") List<BuildStepResponse> steps,
        @CustomType.Parameter("substitutions") Map<String,String> substitutions,
        @CustomType.Parameter("tags") List<String> tags,
        @CustomType.Parameter("timeout") String timeout,
        @CustomType.Parameter("timing") Map<String,String> timing,
        @CustomType.Parameter("warnings") List<WarningResponse> warnings) {
        this.approval = approval;
        this.artifacts = artifacts;
        this.availableSecrets = availableSecrets;
        this.buildTriggerId = buildTriggerId;
        this.createTime = createTime;
        this.failureInfo = failureInfo;
        this.finishTime = finishTime;
        this.images = images;
        this.logUrl = logUrl;
        this.logsBucket = logsBucket;
        this.name = name;
        this.options = options;
        this.project = project;
        this.queueTtl = queueTtl;
        this.results = results;
        this.secrets = secrets;
        this.serviceAccount = serviceAccount;
        this.source = source;
        this.sourceProvenance = sourceProvenance;
        this.startTime = startTime;
        this.status = status;
        this.statusDetail = statusDetail;
        this.steps = steps;
        this.substitutions = substitutions;
        this.tags = tags;
        this.timeout = timeout;
        this.timing = timing;
        this.warnings = warnings;
    }

    /**
     * Describes this build's approval configuration, status, and result.
     * 
    */
    public BuildApprovalResponse getApproval() {
        return this.approval;
    }
    /**
     * Artifacts produced by the build that should be uploaded upon successful completion of all build steps.
     * 
    */
    public ArtifactsResponse getArtifacts() {
        return this.artifacts;
    }
    /**
     * Secrets and secret environment variables.
     * 
    */
    public SecretsResponse getAvailableSecrets() {
        return this.availableSecrets;
    }
    /**
     * The ID of the `BuildTrigger` that triggered this build, if it was triggered automatically.
     * 
    */
    public String getBuildTriggerId() {
        return this.buildTriggerId;
    }
    /**
     * Time at which the request to create the build was received.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Contains information about the build when status=FAILURE.
     * 
    */
    public FailureInfoResponse getFailureInfo() {
        return this.failureInfo;
    }
    /**
     * Time at which execution of the build was finished. The difference between finish_time and start_time is the duration of the build's execution.
     * 
    */
    public String getFinishTime() {
        return this.finishTime;
    }
    /**
     * A list of images to be pushed upon the successful completion of all build steps. The images are pushed using the builder service account's credentials. The digests of the pushed images will be stored in the `Build` resource's results field. If any of the images fail to be pushed, the build status is marked `FAILURE`.
     * 
    */
    public List<String> getImages() {
        return this.images;
    }
    /**
     * URL to logs for this build in Google Cloud Console.
     * 
    */
    public String getLogUrl() {
        return this.logUrl;
    }
    /**
     * Google Cloud Storage bucket where logs should be written (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
     * 
    */
    public String getLogsBucket() {
        return this.logsBucket;
    }
    /**
     * The 'Build' name with format: `projects/{project}/locations/{location}/builds/{build}`, where {build} is a unique identifier generated by the service.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Special options for this build.
     * 
    */
    public BuildOptionsResponse getOptions() {
        return this.options;
    }
    /**
     * ID of the project.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * TTL in queue for this build. If provided and the build is enqueued longer than this value, the build will expire and the build status will be `EXPIRED`. The TTL starts ticking from create_time.
     * 
    */
    public String getQueueTtl() {
        return this.queueTtl;
    }
    /**
     * Results of the build.
     * 
    */
    public ResultsResponse getResults() {
        return this.results;
    }
    /**
     * Secrets to decrypt using Cloud Key Management Service. Note: Secret Manager is the recommended technique for managing sensitive data with Cloud Build. Use `available_secrets` to configure builds to access secrets from Secret Manager. For instructions, see: https://cloud.google.com/cloud-build/docs/securing-builds/use-secrets
     * 
    */
    public List<SecretResponse> getSecrets() {
        return this.secrets;
    }
    /**
     * IAM service account whose credentials will be used at build runtime. Must be of the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`. ACCOUNT can be email address or uniqueId of the service account.
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * The location of the source files to build.
     * 
    */
    public SourceResponse getSource() {
        return this.source;
    }
    /**
     * A permanent fixed identifier for source.
     * 
    */
    public SourceProvenanceResponse getSourceProvenance() {
        return this.sourceProvenance;
    }
    /**
     * Time at which execution of the build was started.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Status of the build.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Customer-readable message about the current status.
     * 
    */
    public String getStatusDetail() {
        return this.statusDetail;
    }
    /**
     * The operations to be performed on the workspace.
     * 
    */
    public List<BuildStepResponse> getSteps() {
        return this.steps;
    }
    /**
     * Substitutions data for `Build` resource.
     * 
    */
    public Map<String,String> getSubstitutions() {
        return this.substitutions;
    }
    /**
     * Tags for annotation of a `Build`. These are not docker tags.
     * 
    */
    public List<String> getTags() {
        return this.tags;
    }
    /**
     * Amount of time that this build should be allowed to run, to second granularity. If this amount of time elapses, work on the build will cease and the build status will be `TIMEOUT`. `timeout` starts ticking from `startTime`. Default time is ten minutes.
     * 
    */
    public String getTimeout() {
        return this.timeout;
    }
    /**
     * Stores timing information for phases of the build. Valid keys are: * BUILD: time to execute all build steps. * PUSH: time to push all specified images. * FETCHSOURCE: time to fetch source. * SETUPBUILD: time to set up build. If the build does not specify source or images, these keys will not be included.
     * 
    */
    public Map<String,String> getTiming() {
        return this.timing;
    }
    /**
     * Non-fatal problems encountered during the execution of the build.
     * 
    */
    public List<WarningResponse> getWarnings() {
        return this.warnings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBuildResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildApprovalResponse approval;
        private ArtifactsResponse artifacts;
        private SecretsResponse availableSecrets;
        private String buildTriggerId;
        private String createTime;
        private FailureInfoResponse failureInfo;
        private String finishTime;
        private List<String> images;
        private String logUrl;
        private String logsBucket;
        private String name;
        private BuildOptionsResponse options;
        private String project;
        private String queueTtl;
        private ResultsResponse results;
        private List<SecretResponse> secrets;
        private String serviceAccount;
        private SourceResponse source;
        private SourceProvenanceResponse sourceProvenance;
        private String startTime;
        private String status;
        private String statusDetail;
        private List<BuildStepResponse> steps;
        private Map<String,String> substitutions;
        private List<String> tags;
        private String timeout;
        private Map<String,String> timing;
        private List<WarningResponse> warnings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBuildResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approval = defaults.approval;
    	      this.artifacts = defaults.artifacts;
    	      this.availableSecrets = defaults.availableSecrets;
    	      this.buildTriggerId = defaults.buildTriggerId;
    	      this.createTime = defaults.createTime;
    	      this.failureInfo = defaults.failureInfo;
    	      this.finishTime = defaults.finishTime;
    	      this.images = defaults.images;
    	      this.logUrl = defaults.logUrl;
    	      this.logsBucket = defaults.logsBucket;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.project = defaults.project;
    	      this.queueTtl = defaults.queueTtl;
    	      this.results = defaults.results;
    	      this.secrets = defaults.secrets;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.source = defaults.source;
    	      this.sourceProvenance = defaults.sourceProvenance;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.statusDetail = defaults.statusDetail;
    	      this.steps = defaults.steps;
    	      this.substitutions = defaults.substitutions;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.timing = defaults.timing;
    	      this.warnings = defaults.warnings;
        }

        public Builder approval(BuildApprovalResponse approval) {
            this.approval = Objects.requireNonNull(approval);
            return this;
        }

        public Builder artifacts(ArtifactsResponse artifacts) {
            this.artifacts = Objects.requireNonNull(artifacts);
            return this;
        }

        public Builder availableSecrets(SecretsResponse availableSecrets) {
            this.availableSecrets = Objects.requireNonNull(availableSecrets);
            return this;
        }

        public Builder buildTriggerId(String buildTriggerId) {
            this.buildTriggerId = Objects.requireNonNull(buildTriggerId);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder failureInfo(FailureInfoResponse failureInfo) {
            this.failureInfo = Objects.requireNonNull(failureInfo);
            return this;
        }

        public Builder finishTime(String finishTime) {
            this.finishTime = Objects.requireNonNull(finishTime);
            return this;
        }

        public Builder images(List<String> images) {
            this.images = Objects.requireNonNull(images);
            return this;
        }

        public Builder logUrl(String logUrl) {
            this.logUrl = Objects.requireNonNull(logUrl);
            return this;
        }

        public Builder logsBucket(String logsBucket) {
            this.logsBucket = Objects.requireNonNull(logsBucket);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder options(BuildOptionsResponse options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }

        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder queueTtl(String queueTtl) {
            this.queueTtl = Objects.requireNonNull(queueTtl);
            return this;
        }

        public Builder results(ResultsResponse results) {
            this.results = Objects.requireNonNull(results);
            return this;
        }

        public Builder secrets(List<SecretResponse> secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder source(SourceResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder sourceProvenance(SourceProvenanceResponse sourceProvenance) {
            this.sourceProvenance = Objects.requireNonNull(sourceProvenance);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder statusDetail(String statusDetail) {
            this.statusDetail = Objects.requireNonNull(statusDetail);
            return this;
        }

        public Builder steps(List<BuildStepResponse> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }

        public Builder substitutions(Map<String,String> substitutions) {
            this.substitutions = Objects.requireNonNull(substitutions);
            return this;
        }

        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public Builder timing(Map<String,String> timing) {
            this.timing = Objects.requireNonNull(timing);
            return this;
        }

        public Builder warnings(List<WarningResponse> warnings) {
            this.warnings = Objects.requireNonNull(warnings);
            return this;
        }
        public GetBuildResult build() {
            return new GetBuildResult(approval, artifacts, availableSecrets, buildTriggerId, createTime, failureInfo, finishTime, images, logUrl, logsBucket, name, options, project, queueTtl, results, secrets, serviceAccount, source, sourceProvenance, startTime, status, statusDetail, steps, substitutions, tags, timeout, timing, warnings);
        }
    }
}
