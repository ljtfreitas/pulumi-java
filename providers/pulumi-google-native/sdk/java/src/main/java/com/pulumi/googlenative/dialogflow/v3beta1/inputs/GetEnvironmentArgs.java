// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnvironmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentArgs Empty = new GetEnvironmentArgs();

    @Import(name="agentId", required=true)
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }

    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
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

    private GetEnvironmentArgs() {}

    private GetEnvironmentArgs(GetEnvironmentArgs $) {
        this.agentId = $.agentId;
        this.environmentId = $.environmentId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentArgs $;

        public Builder() {
            $ = new GetEnvironmentArgs();
        }

        public Builder(GetEnvironmentArgs defaults) {
            $ = new GetEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
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

        public GetEnvironmentArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
