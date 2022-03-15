// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.aws.ssm.enums.ParameterType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ParameterState extends io.pulumi.resources.ResourceArgs {

    public static final ParameterState Empty = new ParameterState();

    /**
     * A regular expression used to validate the parameter value.
     * 
     */
    @Import(name="allowedPattern")
      private final @Nullable Output<String> allowedPattern;

    public Output<String> getAllowedPattern() {
        return this.allowedPattern == null ? Output.empty() : this.allowedPattern;
    }

    /**
     * The ARN of the parameter.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The data_type of the parameter. Valid values: text and aws:ec2:image for AMI format, see the [Native parameter support for Amazon Machine Image IDs
     * ](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html)
     * 
     */
    @Import(name="dataType")
      private final @Nullable Output<String> dataType;

    public Output<String> getDataType() {
        return this.dataType == null ? Output.empty() : this.dataType;
    }

    /**
     * The description of the parameter.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The KMS key id or arn for encrypting a SecureString.
     * 
     */
    @Import(name="keyId")
      private final @Nullable Output<String> keyId;

    public Output<String> getKeyId() {
        return this.keyId == null ? Output.empty() : this.keyId;
    }

    /**
     * The name of the parameter. If the name contains a path (e.g., any forward slashes (`/`)), it must be fully qualified with a leading forward slash (`/`). For additional requirements and constraints, see the [AWS SSM User Guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html).
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Overwrite an existing parameter. If not specified, will default to `false` if the resource has not been created by this provider to avoid overwrite of existing resource and will default to `true` otherwise (lifecycle rules should then be used to manage the update behavior).
     * 
     */
    @Import(name="overwrite")
      private final @Nullable Output<Boolean> overwrite;

    public Output<Boolean> getOverwrite() {
        return this.overwrite == null ? Output.empty() : this.overwrite;
    }

    /**
     * A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    /**
     * The tier of the parameter. If not specified, will default to `Standard`. Valid tiers are `Standard`, `Advanced`, and `Intelligent-Tiering`. For more information on parameter tiers, see the [AWS SSM Parameter tier comparison and guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html).
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<String> tier;

    public Output<String> getTier() {
        return this.tier == null ? Output.empty() : this.tier;
    }

    /**
     * The type of the parameter. Valid types are `String`, `StringList` and `SecureString`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,ParameterType>> type;

    public Output<Either<String,ParameterType>> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * The value of the parameter.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    /**
     * The version of the parameter.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Integer> version;

    public Output<Integer> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public ParameterState(
        @Nullable Output<String> allowedPattern,
        @Nullable Output<String> arn,
        @Nullable Output<String> dataType,
        @Nullable Output<String> description,
        @Nullable Output<String> keyId,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> overwrite,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> tier,
        @Nullable Output<Either<String,ParameterType>> type,
        @Nullable Output<String> value,
        @Nullable Output<Integer> version) {
        this.allowedPattern = allowedPattern;
        this.arn = arn;
        this.dataType = dataType;
        this.description = description;
        this.keyId = keyId;
        this.name = name;
        this.overwrite = overwrite;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.tier = tier;
        this.type = type;
        this.value = value;
        this.version = version;
    }

    private ParameterState() {
        this.allowedPattern = Output.empty();
        this.arn = Output.empty();
        this.dataType = Output.empty();
        this.description = Output.empty();
        this.keyId = Output.empty();
        this.name = Output.empty();
        this.overwrite = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.tier = Output.empty();
        this.type = Output.empty();
        this.value = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allowedPattern;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> dataType;
        private @Nullable Output<String> description;
        private @Nullable Output<String> keyId;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> overwrite;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> tier;
        private @Nullable Output<Either<String,ParameterType>> type;
        private @Nullable Output<String> value;
        private @Nullable Output<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedPattern = defaults.allowedPattern;
    	      this.arn = defaults.arn;
    	      this.dataType = defaults.dataType;
    	      this.description = defaults.description;
    	      this.keyId = defaults.keyId;
    	      this.name = defaults.name;
    	      this.overwrite = defaults.overwrite;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.tier = defaults.tier;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
    	      this.version = defaults.version;
        }

        public Builder allowedPattern(@Nullable Output<String> allowedPattern) {
            this.allowedPattern = allowedPattern;
            return this;
        }

        public Builder allowedPattern(@Nullable String allowedPattern) {
            this.allowedPattern = Output.ofNullable(allowedPattern);
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

        public Builder dataType(@Nullable Output<String> dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder dataType(@Nullable String dataType) {
            this.dataType = Output.ofNullable(dataType);
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

        public Builder keyId(@Nullable Output<String> keyId) {
            this.keyId = keyId;
            return this;
        }

        public Builder keyId(@Nullable String keyId) {
            this.keyId = Output.ofNullable(keyId);
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

        public Builder overwrite(@Nullable Output<Boolean> overwrite) {
            this.overwrite = overwrite;
            return this;
        }

        public Builder overwrite(@Nullable Boolean overwrite) {
            this.overwrite = Output.ofNullable(overwrite);
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

        public Builder tier(@Nullable Output<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = Output.ofNullable(tier);
            return this;
        }

        public Builder type(@Nullable Output<Either<String,ParameterType>> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable Either<String,ParameterType> type) {
            this.type = Output.ofNullable(type);
            return this;
        }

        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }

        public Builder version(@Nullable Output<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable Integer version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public ParameterState build() {
            return new ParameterState(allowedPattern, arn, dataType, description, keyId, name, overwrite, tags, tagsAll, tier, type, value, version);
        }
    }
}
