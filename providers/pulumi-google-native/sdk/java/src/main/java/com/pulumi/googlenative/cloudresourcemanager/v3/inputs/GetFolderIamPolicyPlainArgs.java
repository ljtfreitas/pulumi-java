// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager.v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFolderIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFolderIamPolicyPlainArgs Empty = new GetFolderIamPolicyPlainArgs();

    @Import(name="folderId", required=true)
    private String folderId;

    public String folderId() {
        return this.folderId;
    }

    private GetFolderIamPolicyPlainArgs() {}

    private GetFolderIamPolicyPlainArgs(GetFolderIamPolicyPlainArgs $) {
        this.folderId = $.folderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFolderIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFolderIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetFolderIamPolicyPlainArgs();
        }

        public Builder(GetFolderIamPolicyPlainArgs defaults) {
            $ = new GetFolderIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder folderId(String folderId) {
            $.folderId = folderId;
            return this;
        }

        public GetFolderIamPolicyPlainArgs build() {
            $.folderId = Objects.requireNonNull($.folderId, "expected parameter 'folderId' to be non-null");
            return $;
        }
    }

}
