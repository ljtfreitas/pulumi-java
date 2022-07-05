// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVersionArgs Empty = new GetVersionArgs();

    @Import(name="agentId", required=true)
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }

    @Import(name="flowId", required=true)
    private Output<String> flowId;

    public Output<String> flowId() {
        return this.flowId;
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

    @Import(name="versionId", required=true)
    private Output<String> versionId;

    public Output<String> versionId() {
        return this.versionId;
    }

    private GetVersionArgs() {}

    private GetVersionArgs(GetVersionArgs $) {
        this.agentId = $.agentId;
        this.flowId = $.flowId;
        this.location = $.location;
        this.project = $.project;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVersionArgs $;

        public Builder() {
            $ = new GetVersionArgs();
        }

        public Builder(GetVersionArgs defaults) {
            $ = new GetVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder agentId(Output<String> agentId) {
            $.agentId = agentId;
            return this;
        }

        public Builder agentId(String agentId) {
            return agentId(Output.of(agentId));
        }

        public Builder flowId(Output<String> flowId) {
            $.flowId = flowId;
            return this;
        }

        public Builder flowId(String flowId) {
            return flowId(Output.of(flowId));
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

        public Builder versionId(Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public GetVersionArgs build() {
            $.agentId = Objects.requireNonNull($.agentId, "expected parameter 'agentId' to be non-null");
            $.flowId = Objects.requireNonNull($.flowId, "expected parameter 'flowId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.versionId = Objects.requireNonNull($.versionId, "expected parameter 'versionId' to be non-null");
            return $;
        }
    }

}
