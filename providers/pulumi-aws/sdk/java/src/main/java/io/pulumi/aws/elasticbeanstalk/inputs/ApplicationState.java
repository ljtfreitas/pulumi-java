// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.inputs;

import io.pulumi.aws.elasticbeanstalk.inputs.ApplicationAppversionLifecycleGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationState extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationState Empty = new ApplicationState();

    @Import(name="appversionLifecycle")
      private final @Nullable Output<ApplicationAppversionLifecycleGetArgs> appversionLifecycle;

    public Output<ApplicationAppversionLifecycleGetArgs> getAppversionLifecycle() {
        return this.appversionLifecycle == null ? Output.empty() : this.appversionLifecycle;
    }

    /**
     * The ARN assigned by AWS for this Elastic Beanstalk Application.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Short description of the application
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the application, must be unique within your account
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Key-value map of tags for the Elastic Beanstalk Application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public ApplicationState(
        @Nullable Output<ApplicationAppversionLifecycleGetArgs> appversionLifecycle,
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.appversionLifecycle = appversionLifecycle;
        this.arn = arn;
        this.description = description;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ApplicationState() {
        this.appversionLifecycle = Output.empty();
        this.arn = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ApplicationAppversionLifecycleGetArgs> appversionLifecycle;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appversionLifecycle = defaults.appversionLifecycle;
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder appversionLifecycle(@Nullable Output<ApplicationAppversionLifecycleGetArgs> appversionLifecycle) {
            this.appversionLifecycle = appversionLifecycle;
            return this;
        }

        public Builder appversionLifecycle(@Nullable ApplicationAppversionLifecycleGetArgs appversionLifecycle) {
            this.appversionLifecycle = Output.ofNullable(appversionLifecycle);
            return this;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
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

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public ApplicationState build() {
            return new ApplicationState(appversionLifecycle, arn, description, name, tags, tagsAll);
        }
    }
}
