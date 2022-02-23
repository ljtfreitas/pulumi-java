// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom;

import io.pulumi.awsnative.wisdom.enums.KnowledgeBaseType;
import io.pulumi.awsnative.wisdom.inputs.KnowledgeBaseRenderingConfigurationArgs;
import io.pulumi.awsnative.wisdom.inputs.KnowledgeBaseServerSideEncryptionConfigurationArgs;
import io.pulumi.awsnative.wisdom.inputs.KnowledgeBaseSourceConfigurationArgs;
import io.pulumi.awsnative.wisdom.inputs.KnowledgeBaseTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KnowledgeBaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final KnowledgeBaseArgs Empty = new KnowledgeBaseArgs();

    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="knowledgeBaseType", required=true)
        private final Input<KnowledgeBaseType> knowledgeBaseType;

    public Input<KnowledgeBaseType> getKnowledgeBaseType() {
        return this.knowledgeBaseType;
    }

    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="renderingConfiguration")
        private final @Nullable Input<KnowledgeBaseRenderingConfigurationArgs> renderingConfiguration;

    public Input<KnowledgeBaseRenderingConfigurationArgs> getRenderingConfiguration() {
        return this.renderingConfiguration == null ? Input.empty() : this.renderingConfiguration;
    }

    @InputImport(name="serverSideEncryptionConfiguration")
        private final @Nullable Input<KnowledgeBaseServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration;

    public Input<KnowledgeBaseServerSideEncryptionConfigurationArgs> getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration == null ? Input.empty() : this.serverSideEncryptionConfiguration;
    }

    @InputImport(name="sourceConfiguration")
        private final @Nullable Input<KnowledgeBaseSourceConfigurationArgs> sourceConfiguration;

    public Input<KnowledgeBaseSourceConfigurationArgs> getSourceConfiguration() {
        return this.sourceConfiguration == null ? Input.empty() : this.sourceConfiguration;
    }

    @InputImport(name="tags")
        private final @Nullable Input<List<KnowledgeBaseTagArgs>> tags;

    public Input<List<KnowledgeBaseTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public KnowledgeBaseArgs(
        @Nullable Input<String> description,
        Input<KnowledgeBaseType> knowledgeBaseType,
        @Nullable Input<String> name,
        @Nullable Input<KnowledgeBaseRenderingConfigurationArgs> renderingConfiguration,
        @Nullable Input<KnowledgeBaseServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration,
        @Nullable Input<KnowledgeBaseSourceConfigurationArgs> sourceConfiguration,
        @Nullable Input<List<KnowledgeBaseTagArgs>> tags) {
        this.description = description;
        this.knowledgeBaseType = Objects.requireNonNull(knowledgeBaseType, "expected parameter 'knowledgeBaseType' to be non-null");
        this.name = name;
        this.renderingConfiguration = renderingConfiguration;
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
        this.sourceConfiguration = sourceConfiguration;
        this.tags = tags;
    }

    private KnowledgeBaseArgs() {
        this.description = Input.empty();
        this.knowledgeBaseType = Input.empty();
        this.name = Input.empty();
        this.renderingConfiguration = Input.empty();
        this.serverSideEncryptionConfiguration = Input.empty();
        this.sourceConfiguration = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KnowledgeBaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<KnowledgeBaseType> knowledgeBaseType;
        private @Nullable Input<String> name;
        private @Nullable Input<KnowledgeBaseRenderingConfigurationArgs> renderingConfiguration;
        private @Nullable Input<KnowledgeBaseServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration;
        private @Nullable Input<KnowledgeBaseSourceConfigurationArgs> sourceConfiguration;
        private @Nullable Input<List<KnowledgeBaseTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(KnowledgeBaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.knowledgeBaseType = defaults.knowledgeBaseType;
    	      this.name = defaults.name;
    	      this.renderingConfiguration = defaults.renderingConfiguration;
    	      this.serverSideEncryptionConfiguration = defaults.serverSideEncryptionConfiguration;
    	      this.sourceConfiguration = defaults.sourceConfiguration;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setKnowledgeBaseType(Input<KnowledgeBaseType> knowledgeBaseType) {
            this.knowledgeBaseType = Objects.requireNonNull(knowledgeBaseType);
            return this;
        }

        public Builder setKnowledgeBaseType(KnowledgeBaseType knowledgeBaseType) {
            this.knowledgeBaseType = Input.of(Objects.requireNonNull(knowledgeBaseType));
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

        public Builder setRenderingConfiguration(@Nullable Input<KnowledgeBaseRenderingConfigurationArgs> renderingConfiguration) {
            this.renderingConfiguration = renderingConfiguration;
            return this;
        }

        public Builder setRenderingConfiguration(@Nullable KnowledgeBaseRenderingConfigurationArgs renderingConfiguration) {
            this.renderingConfiguration = Input.ofNullable(renderingConfiguration);
            return this;
        }

        public Builder setServerSideEncryptionConfiguration(@Nullable Input<KnowledgeBaseServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
            return this;
        }

        public Builder setServerSideEncryptionConfiguration(@Nullable KnowledgeBaseServerSideEncryptionConfigurationArgs serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = Input.ofNullable(serverSideEncryptionConfiguration);
            return this;
        }

        public Builder setSourceConfiguration(@Nullable Input<KnowledgeBaseSourceConfigurationArgs> sourceConfiguration) {
            this.sourceConfiguration = sourceConfiguration;
            return this;
        }

        public Builder setSourceConfiguration(@Nullable KnowledgeBaseSourceConfigurationArgs sourceConfiguration) {
            this.sourceConfiguration = Input.ofNullable(sourceConfiguration);
            return this;
        }

        public Builder setTags(@Nullable Input<List<KnowledgeBaseTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<KnowledgeBaseTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public KnowledgeBaseArgs build() {
            return new KnowledgeBaseArgs(description, knowledgeBaseType, name, renderingConfiguration, serverSideEncryptionConfiguration, sourceConfiguration, tags);
        }
    }
}
