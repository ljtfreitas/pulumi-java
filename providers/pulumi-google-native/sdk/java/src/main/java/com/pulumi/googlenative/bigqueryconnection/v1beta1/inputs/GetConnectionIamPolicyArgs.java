// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigqueryconnection.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionIamPolicyArgs Empty = new GetConnectionIamPolicyArgs();

    @Import(name="connectionId", required=true)
    private Output<String> connectionId;

    public Output<String> connectionId() {
        return this.connectionId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetConnectionIamPolicyArgs() {}

    private GetConnectionIamPolicyArgs(GetConnectionIamPolicyArgs $) {
        this.connectionId = $.connectionId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionIamPolicyArgs $;

        public Builder() {
            $ = new GetConnectionIamPolicyArgs();
        }

        public Builder(GetConnectionIamPolicyArgs defaults) {
            $ = new GetConnectionIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectionId(Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetConnectionIamPolicyArgs build() {
            $.connectionId = Objects.requireNonNull($.connectionId, "expected parameter 'connectionId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
