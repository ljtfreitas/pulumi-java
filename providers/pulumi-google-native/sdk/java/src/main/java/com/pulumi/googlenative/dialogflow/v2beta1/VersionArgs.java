// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final VersionArgs Empty = new VersionArgs();

    /**
     * Optional. The developer-provided description of this version.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. The developer-provided description of this version.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private VersionArgs() {}

    private VersionArgs(VersionArgs $) {
        this.description = $.description;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VersionArgs $;

        public Builder() {
            $ = new VersionArgs();
        }

        public Builder(VersionArgs defaults) {
            $ = new VersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. The developer-provided description of this version.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. The developer-provided description of this version.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder location(@Nullable Output<String> location) {
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

        public VersionArgs build() {
            return $;
        }
    }

}
