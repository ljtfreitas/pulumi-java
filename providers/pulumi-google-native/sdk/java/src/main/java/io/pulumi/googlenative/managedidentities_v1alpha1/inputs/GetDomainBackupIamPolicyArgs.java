// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainBackupIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainBackupIamPolicyArgs Empty = new GetDomainBackupIamPolicyArgs();

    @Import(name="backupId", required=true)
      private final String backupId;

    public String getBackupId() {
        return this.backupId;
    }

    @Import(name="domainId", required=true)
      private final String domainId;

    public String getDomainId() {
        return this.domainId;
    }

    @Import(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> getOptionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetDomainBackupIamPolicyArgs(
        String backupId,
        String domainId,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.backupId = Objects.requireNonNull(backupId, "expected parameter 'backupId' to be non-null");
        this.domainId = Objects.requireNonNull(domainId, "expected parameter 'domainId' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetDomainBackupIamPolicyArgs() {
        this.backupId = null;
        this.domainId = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainBackupIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupId;
        private String domainId;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainBackupIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.domainId = defaults.domainId;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
        }

        public Builder backupId(String backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }

        public Builder domainId(String domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetDomainBackupIamPolicyArgs build() {
            return new GetDomainBackupIamPolicyArgs(backupId, domainId, optionsRequestedPolicyVersion, project);
        }
    }
}
