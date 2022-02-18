// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The source trigger that caused a run.
 * 
 */
public final class SourceTriggerDescriptorResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceTriggerDescriptorResponse Empty = new SourceTriggerDescriptorResponse();

    /**
     * The branch name in the repository.
     * 
     */
    @InputImport(name="branchName")
    private final @Nullable String branchName;

    public Optional<String> getBranchName() {
        return this.branchName == null ? Optional.empty() : Optional.ofNullable(this.branchName);
    }

    /**
     * The unique ID that identifies a commit.
     * 
     */
    @InputImport(name="commitId")
    private final @Nullable String commitId;

    public Optional<String> getCommitId() {
        return this.commitId == null ? Optional.empty() : Optional.ofNullable(this.commitId);
    }

    /**
     * The event type of the trigger.
     * 
     */
    @InputImport(name="eventType")
    private final @Nullable String eventType;

    public Optional<String> getEventType() {
        return this.eventType == null ? Optional.empty() : Optional.ofNullable(this.eventType);
    }

    /**
     * The unique ID of the trigger.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The source control provider type.
     * 
     */
    @InputImport(name="providerType")
    private final @Nullable String providerType;

    public Optional<String> getProviderType() {
        return this.providerType == null ? Optional.empty() : Optional.ofNullable(this.providerType);
    }

    /**
     * The unique ID that identifies pull request.
     * 
     */
    @InputImport(name="pullRequestId")
    private final @Nullable String pullRequestId;

    public Optional<String> getPullRequestId() {
        return this.pullRequestId == null ? Optional.empty() : Optional.ofNullable(this.pullRequestId);
    }

    /**
     * The repository URL.
     * 
     */
    @InputImport(name="repositoryUrl")
    private final @Nullable String repositoryUrl;

    public Optional<String> getRepositoryUrl() {
        return this.repositoryUrl == null ? Optional.empty() : Optional.ofNullable(this.repositoryUrl);
    }

    public SourceTriggerDescriptorResponse(
        @Nullable String branchName,
        @Nullable String commitId,
        @Nullable String eventType,
        @Nullable String id,
        @Nullable String providerType,
        @Nullable String pullRequestId,
        @Nullable String repositoryUrl) {
        this.branchName = branchName;
        this.commitId = commitId;
        this.eventType = eventType;
        this.id = id;
        this.providerType = providerType;
        this.pullRequestId = pullRequestId;
        this.repositoryUrl = repositoryUrl;
    }

    private SourceTriggerDescriptorResponse() {
        this.branchName = null;
        this.commitId = null;
        this.eventType = null;
        this.id = null;
        this.providerType = null;
        this.pullRequestId = null;
        this.repositoryUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceTriggerDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branchName;
        private @Nullable String commitId;
        private @Nullable String eventType;
        private @Nullable String id;
        private @Nullable String providerType;
        private @Nullable String pullRequestId;
        private @Nullable String repositoryUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceTriggerDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchName = defaults.branchName;
    	      this.commitId = defaults.commitId;
    	      this.eventType = defaults.eventType;
    	      this.id = defaults.id;
    	      this.providerType = defaults.providerType;
    	      this.pullRequestId = defaults.pullRequestId;
    	      this.repositoryUrl = defaults.repositoryUrl;
        }

        public Builder setBranchName(@Nullable String branchName) {
            this.branchName = branchName;
            return this;
        }

        public Builder setCommitId(@Nullable String commitId) {
            this.commitId = commitId;
            return this;
        }

        public Builder setEventType(@Nullable String eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setProviderType(@Nullable String providerType) {
            this.providerType = providerType;
            return this;
        }

        public Builder setPullRequestId(@Nullable String pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }

        public Builder setRepositoryUrl(@Nullable String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }

        public SourceTriggerDescriptorResponse build() {
            return new SourceTriggerDescriptorResponse(branchName, commitId, eventType, id, providerType, pullRequestId, repositoryUrl);
        }
    }
}
