// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceContainerImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceContainerImageArgs Empty = new InstanceContainerImageArgs();

    /**
     * The path to the container image repository.
     * For example: gcr.io/{project_id}/{imageName}
     * 
     */
    @InputImport(name="repository", required=true)
        private final Input<String> repository;

    public Input<String> getRepository() {
        return this.repository;
    }

    /**
     * The tag of the container image. If not specified, this defaults to the latest tag.
     * 
     */
    @InputImport(name="tag")
        private final @Nullable Input<String> tag;

    public Input<String> getTag() {
        return this.tag == null ? Input.empty() : this.tag;
    }

    public InstanceContainerImageArgs(
        Input<String> repository,
        @Nullable Input<String> tag) {
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
        this.tag = tag;
    }

    private InstanceContainerImageArgs() {
        this.repository = Input.empty();
        this.tag = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceContainerImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> repository;
        private @Nullable Input<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceContainerImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
        }

        public Builder setRepository(Input<String> repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }

        public Builder setRepository(String repository) {
            this.repository = Input.of(Objects.requireNonNull(repository));
            return this;
        }

        public Builder setTag(@Nullable Input<String> tag) {
            this.tag = tag;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = Input.ofNullable(tag);
            return this;
        }
        public InstanceContainerImageArgs build() {
            return new InstanceContainerImageArgs(repository, tag);
        }
    }
}
