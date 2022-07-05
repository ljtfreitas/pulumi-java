// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.artifactregistry.v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTagArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagArgs Empty = new GetTagArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="packageId", required=true)
    private Output<String> packageId;

    public Output<String> packageId() {
        return this.packageId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="repositoryId", required=true)
    private Output<String> repositoryId;

    public Output<String> repositoryId() {
        return this.repositoryId;
    }

    @Import(name="tagId", required=true)
    private Output<String> tagId;

    public Output<String> tagId() {
        return this.tagId;
    }

    private GetTagArgs() {}

    private GetTagArgs(GetTagArgs $) {
        this.location = $.location;
        this.packageId = $.packageId;
        this.project = $.project;
        this.repositoryId = $.repositoryId;
        this.tagId = $.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagArgs $;

        public Builder() {
            $ = new GetTagArgs();
        }

        public Builder(GetTagArgs defaults) {
            $ = new GetTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder packageId(Output<String> packageId) {
            $.packageId = packageId;
            return this;
        }

        public Builder packageId(String packageId) {
            return packageId(Output.of(packageId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder repositoryId(Output<String> repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        public Builder repositoryId(String repositoryId) {
            return repositoryId(Output.of(repositoryId));
        }

        public Builder tagId(Output<String> tagId) {
            $.tagId = tagId;
            return this;
        }

        public Builder tagId(String tagId) {
            return tagId(Output.of(tagId));
        }

        public GetTagArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.packageId = Objects.requireNonNull($.packageId, "expected parameter 'packageId' to be non-null");
            $.repositoryId = Objects.requireNonNull($.repositoryId, "expected parameter 'repositoryId' to be non-null");
            $.tagId = Objects.requireNonNull($.tagId, "expected parameter 'tagId' to be non-null");
            return $;
        }
    }

}
