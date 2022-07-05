// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager.v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProjectIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectIamPolicyPlainArgs Empty = new GetProjectIamPolicyPlainArgs();

    @Import(name="resource", required=true)
    private String resource;

    public String resource() {
        return this.resource;
    }

    private GetProjectIamPolicyPlainArgs() {}

    private GetProjectIamPolicyPlainArgs(GetProjectIamPolicyPlainArgs $) {
        this.resource = $.resource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetProjectIamPolicyPlainArgs();
        }

        public Builder(GetProjectIamPolicyPlainArgs defaults) {
            $ = new GetProjectIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder resource(String resource) {
            $.resource = resource;
            return this;
        }

        public GetProjectIamPolicyPlainArgs build() {
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            return $;
        }
    }

}
