// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
     * 
     */
    @Import(name="computePlatform")
      private final @Nullable Output<String> computePlatform;

    public Output<String> getComputePlatform() {
        return this.computePlatform == null ? Output.empty() : this.computePlatform;
    }

    /**
     * The name of the application.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ApplicationArgs(
        @Nullable Output<String> computePlatform,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags) {
        this.computePlatform = computePlatform;
        this.name = name;
        this.tags = tags;
    }

    private ApplicationArgs() {
        this.computePlatform = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> computePlatform;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computePlatform = defaults.computePlatform;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder computePlatform(@Nullable Output<String> computePlatform) {
            this.computePlatform = computePlatform;
            return this;
        }

        public Builder computePlatform(@Nullable String computePlatform) {
            this.computePlatform = Output.ofNullable(computePlatform);
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

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public ApplicationArgs build() {
            return new ApplicationArgs(computePlatform, name, tags);
        }
    }
}
