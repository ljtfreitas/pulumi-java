// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.orgpolicy_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.orgpolicy_v2.inputs.GoogleCloudOrgpolicyV2PolicySpecArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FolderPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FolderPolicyArgs Empty = new FolderPolicyArgs();

    @Import(name="folderId", required=true)
      private final Output<String> folderId;

    public Output<String> getFolderId() {
        return this.folderId;
    }

    /**
     * Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, "projects/123/policies/compute.disableSerialPortAccess". Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Basic information about the Organization Policy.
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec;

    public Output<GoogleCloudOrgpolicyV2PolicySpecArgs> getSpec() {
        return this.spec == null ? Output.empty() : this.spec;
    }

    public FolderPolicyArgs(
        Output<String> folderId,
        @Nullable Output<String> name,
        @Nullable Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec) {
        this.folderId = Objects.requireNonNull(folderId, "expected parameter 'folderId' to be non-null");
        this.name = name;
        this.spec = spec;
    }

    private FolderPolicyArgs() {
        this.folderId = Output.empty();
        this.name = Output.empty();
        this.spec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> folderId;
        private @Nullable Output<String> name;
        private @Nullable Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folderId = defaults.folderId;
    	      this.name = defaults.name;
    	      this.spec = defaults.spec;
        }

        public Builder folderId(Output<String> folderId) {
            this.folderId = Objects.requireNonNull(folderId);
            return this;
        }

        public Builder folderId(String folderId) {
            this.folderId = Output.of(Objects.requireNonNull(folderId));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder spec(@Nullable Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder spec(@Nullable GoogleCloudOrgpolicyV2PolicySpecArgs spec) {
            this.spec = Output.ofNullable(spec);
            return this;
        }
        public FolderPolicyArgs build() {
            return new FolderPolicyArgs(folderId, name, spec);
        }
    }
}
