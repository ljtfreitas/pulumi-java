// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFolderIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFolderIamPolicyArgs Empty = new GetFolderIamPolicyArgs();

    @Import(name="folderId", required=true)
      private final String folderId;

    public String getFolderId() {
        return this.folderId;
    }

    public GetFolderIamPolicyArgs(String folderId) {
        this.folderId = Objects.requireNonNull(folderId, "expected parameter 'folderId' to be non-null");
    }

    private GetFolderIamPolicyArgs() {
        this.folderId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFolderIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String folderId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFolderIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folderId = defaults.folderId;
        }

        public Builder folderId(String folderId) {
            this.folderId = Objects.requireNonNull(folderId);
            return this;
        }
        public GetFolderIamPolicyArgs build() {
            return new GetFolderIamPolicyArgs(folderId);
        }
    }
}
