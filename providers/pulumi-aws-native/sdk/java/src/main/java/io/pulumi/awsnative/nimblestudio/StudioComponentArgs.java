// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio;

import io.pulumi.awsnative.nimblestudio.enums.StudioComponentSubtype;
import io.pulumi.awsnative.nimblestudio.enums.StudioComponentType;
import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentConfigurationArgs;
import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentInitializationScriptArgs;
import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentScriptParameterKeyValueArgs;
import io.pulumi.awsnative.nimblestudio.inputs.StudioComponentTagsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StudioComponentArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioComponentArgs Empty = new StudioComponentArgs();

    @InputImport(name="configuration")
        private final @Nullable Input<StudioComponentConfigurationArgs> configuration;

    public Input<StudioComponentConfigurationArgs> getConfiguration() {
        return this.configuration == null ? Input.empty() : this.configuration;
    }

    /**
     * <p>The description.</p>
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * <p>The EC2 security groups that control access to the studio component.</p>
     * 
     */
    @InputImport(name="ec2SecurityGroupIds")
        private final @Nullable Input<List<String>> ec2SecurityGroupIds;

    public Input<List<String>> getEc2SecurityGroupIds() {
        return this.ec2SecurityGroupIds == null ? Input.empty() : this.ec2SecurityGroupIds;
    }

    /**
     * <p>Initialization scripts for studio components.</p>
     * 
     */
    @InputImport(name="initializationScripts")
        private final @Nullable Input<List<StudioComponentInitializationScriptArgs>> initializationScripts;

    public Input<List<StudioComponentInitializationScriptArgs>> getInitializationScripts() {
        return this.initializationScripts == null ? Input.empty() : this.initializationScripts;
    }

    /**
     * <p>The name for the studio component.</p>
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * <p>Parameters for the studio component scripts.</p>
     * 
     */
    @InputImport(name="scriptParameters")
        private final @Nullable Input<List<StudioComponentScriptParameterKeyValueArgs>> scriptParameters;

    public Input<List<StudioComponentScriptParameterKeyValueArgs>> getScriptParameters() {
        return this.scriptParameters == null ? Input.empty() : this.scriptParameters;
    }

    /**
     * <p>The studioId. </p>
     * 
     */
    @InputImport(name="studioId", required=true)
        private final Input<String> studioId;

    public Input<String> getStudioId() {
        return this.studioId;
    }

    @InputImport(name="subtype")
        private final @Nullable Input<StudioComponentSubtype> subtype;

    public Input<StudioComponentSubtype> getSubtype() {
        return this.subtype == null ? Input.empty() : this.subtype;
    }

    @InputImport(name="tags")
        private final @Nullable Input<StudioComponentTagsArgs> tags;

    public Input<StudioComponentTagsArgs> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="type", required=true)
        private final Input<StudioComponentType> type;

    public Input<StudioComponentType> getType() {
        return this.type;
    }

    public StudioComponentArgs(
        @Nullable Input<StudioComponentConfigurationArgs> configuration,
        @Nullable Input<String> description,
        @Nullable Input<List<String>> ec2SecurityGroupIds,
        @Nullable Input<List<StudioComponentInitializationScriptArgs>> initializationScripts,
        @Nullable Input<String> name,
        @Nullable Input<List<StudioComponentScriptParameterKeyValueArgs>> scriptParameters,
        Input<String> studioId,
        @Nullable Input<StudioComponentSubtype> subtype,
        @Nullable Input<StudioComponentTagsArgs> tags,
        Input<StudioComponentType> type) {
        this.configuration = configuration;
        this.description = description;
        this.ec2SecurityGroupIds = ec2SecurityGroupIds;
        this.initializationScripts = initializationScripts;
        this.name = name;
        this.scriptParameters = scriptParameters;
        this.studioId = Objects.requireNonNull(studioId, "expected parameter 'studioId' to be non-null");
        this.subtype = subtype;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private StudioComponentArgs() {
        this.configuration = Input.empty();
        this.description = Input.empty();
        this.ec2SecurityGroupIds = Input.empty();
        this.initializationScripts = Input.empty();
        this.name = Input.empty();
        this.scriptParameters = Input.empty();
        this.studioId = Input.empty();
        this.subtype = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<StudioComponentConfigurationArgs> configuration;
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> ec2SecurityGroupIds;
        private @Nullable Input<List<StudioComponentInitializationScriptArgs>> initializationScripts;
        private @Nullable Input<String> name;
        private @Nullable Input<List<StudioComponentScriptParameterKeyValueArgs>> scriptParameters;
        private Input<String> studioId;
        private @Nullable Input<StudioComponentSubtype> subtype;
        private @Nullable Input<StudioComponentTagsArgs> tags;
        private Input<StudioComponentType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.ec2SecurityGroupIds = defaults.ec2SecurityGroupIds;
    	      this.initializationScripts = defaults.initializationScripts;
    	      this.name = defaults.name;
    	      this.scriptParameters = defaults.scriptParameters;
    	      this.studioId = defaults.studioId;
    	      this.subtype = defaults.subtype;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setConfiguration(@Nullable Input<StudioComponentConfigurationArgs> configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setConfiguration(@Nullable StudioComponentConfigurationArgs configuration) {
            this.configuration = Input.ofNullable(configuration);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEc2SecurityGroupIds(@Nullable Input<List<String>> ec2SecurityGroupIds) {
            this.ec2SecurityGroupIds = ec2SecurityGroupIds;
            return this;
        }

        public Builder setEc2SecurityGroupIds(@Nullable List<String> ec2SecurityGroupIds) {
            this.ec2SecurityGroupIds = Input.ofNullable(ec2SecurityGroupIds);
            return this;
        }

        public Builder setInitializationScripts(@Nullable Input<List<StudioComponentInitializationScriptArgs>> initializationScripts) {
            this.initializationScripts = initializationScripts;
            return this;
        }

        public Builder setInitializationScripts(@Nullable List<StudioComponentInitializationScriptArgs> initializationScripts) {
            this.initializationScripts = Input.ofNullable(initializationScripts);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setScriptParameters(@Nullable Input<List<StudioComponentScriptParameterKeyValueArgs>> scriptParameters) {
            this.scriptParameters = scriptParameters;
            return this;
        }

        public Builder setScriptParameters(@Nullable List<StudioComponentScriptParameterKeyValueArgs> scriptParameters) {
            this.scriptParameters = Input.ofNullable(scriptParameters);
            return this;
        }

        public Builder setStudioId(Input<String> studioId) {
            this.studioId = Objects.requireNonNull(studioId);
            return this;
        }

        public Builder setStudioId(String studioId) {
            this.studioId = Input.of(Objects.requireNonNull(studioId));
            return this;
        }

        public Builder setSubtype(@Nullable Input<StudioComponentSubtype> subtype) {
            this.subtype = subtype;
            return this;
        }

        public Builder setSubtype(@Nullable StudioComponentSubtype subtype) {
            this.subtype = Input.ofNullable(subtype);
            return this;
        }

        public Builder setTags(@Nullable Input<StudioComponentTagsArgs> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable StudioComponentTagsArgs tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setType(Input<StudioComponentType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(StudioComponentType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public StudioComponentArgs build() {
            return new StudioComponentArgs(configuration, description, ec2SecurityGroupIds, initializationScripts, name, scriptParameters, studioId, subtype, tags, type);
        }
    }
}
