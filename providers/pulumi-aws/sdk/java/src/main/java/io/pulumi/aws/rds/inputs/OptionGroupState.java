// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.aws.rds.inputs.OptionGroupOptionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OptionGroupState extends io.pulumi.resources.ResourceArgs {

    public static final OptionGroupState Empty = new OptionGroupState();

    /**
     * The ARN of the db option group.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Specifies the name of the engine that this option group should be associated with.
     * 
     */
    @Import(name="engineName")
      private final @Nullable Output<String> engineName;

    public Output<String> getEngineName() {
        return this.engineName == null ? Output.empty() : this.engineName;
    }

    /**
     * Specifies the major version of the engine that this option group should be associated with.
     * 
     */
    @Import(name="majorEngineVersion")
      private final @Nullable Output<String> majorEngineVersion;

    public Output<String> getMajorEngineVersion() {
        return this.majorEngineVersion == null ? Output.empty() : this.majorEngineVersion;
    }

    /**
     * The Name of the setting.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Output.empty() : this.namePrefix;
    }

    /**
     * The description of the option group. Defaults to "Managed by Pulumi".
     * 
     */
    @Import(name="optionGroupDescription")
      private final @Nullable Output<String> optionGroupDescription;

    public Output<String> getOptionGroupDescription() {
        return this.optionGroupDescription == null ? Output.empty() : this.optionGroupDescription;
    }

    /**
     * A list of Options to apply.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<List<OptionGroupOptionGetArgs>> options;

    public Output<List<OptionGroupOptionGetArgs>> getOptions() {
        return this.options == null ? Output.empty() : this.options;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public OptionGroupState(
        @Nullable Output<String> arn,
        @Nullable Output<String> engineName,
        @Nullable Output<String> majorEngineVersion,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> optionGroupDescription,
        @Nullable Output<List<OptionGroupOptionGetArgs>> options,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.engineName = engineName;
        this.majorEngineVersion = majorEngineVersion;
        this.name = name;
        this.namePrefix = namePrefix;
        this.optionGroupDescription = optionGroupDescription == null ? Output.ofNullable("Managed by Pulumi") : optionGroupDescription;
        this.options = options;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private OptionGroupState() {
        this.arn = Output.empty();
        this.engineName = Output.empty();
        this.majorEngineVersion = Output.empty();
        this.name = Output.empty();
        this.namePrefix = Output.empty();
        this.optionGroupDescription = Output.empty();
        this.options = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> engineName;
        private @Nullable Output<String> majorEngineVersion;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> optionGroupDescription;
        private @Nullable Output<List<OptionGroupOptionGetArgs>> options;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.engineName = defaults.engineName;
    	      this.majorEngineVersion = defaults.majorEngineVersion;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.optionGroupDescription = defaults.optionGroupDescription;
    	      this.options = defaults.options;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder engineName(@Nullable Output<String> engineName) {
            this.engineName = engineName;
            return this;
        }

        public Builder engineName(@Nullable String engineName) {
            this.engineName = Output.ofNullable(engineName);
            return this;
        }

        public Builder majorEngineVersion(@Nullable Output<String> majorEngineVersion) {
            this.majorEngineVersion = majorEngineVersion;
            return this;
        }

        public Builder majorEngineVersion(@Nullable String majorEngineVersion) {
            this.majorEngineVersion = Output.ofNullable(majorEngineVersion);
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

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Output.ofNullable(namePrefix);
            return this;
        }

        public Builder optionGroupDescription(@Nullable Output<String> optionGroupDescription) {
            this.optionGroupDescription = optionGroupDescription;
            return this;
        }

        public Builder optionGroupDescription(@Nullable String optionGroupDescription) {
            this.optionGroupDescription = Output.ofNullable(optionGroupDescription);
            return this;
        }

        public Builder options(@Nullable Output<List<OptionGroupOptionGetArgs>> options) {
            this.options = options;
            return this;
        }

        public Builder options(@Nullable List<OptionGroupOptionGetArgs> options) {
            this.options = Output.ofNullable(options);
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
        public OptionGroupState build() {
            return new OptionGroupState(arn, engineName, majorEngineVersion, name, namePrefix, optionGroupDescription, options, tags, tagsAll);
        }
    }
}
