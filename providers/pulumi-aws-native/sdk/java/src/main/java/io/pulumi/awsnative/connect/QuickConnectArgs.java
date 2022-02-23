// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect;

import io.pulumi.awsnative.connect.inputs.QuickConnectConfigArgs;
import io.pulumi.awsnative.connect.inputs.QuickConnectTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QuickConnectArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuickConnectArgs Empty = new QuickConnectArgs();

    /**
     * The description of the quick connect.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The identifier of the Amazon Connect instance.
     * 
     */
    @InputImport(name="instanceArn", required=true)
        private final Input<String> instanceArn;

    public Input<String> getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * The name of the quick connect.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration settings for the quick connect.
     * 
     */
    @InputImport(name="quickConnectConfig", required=true)
        private final Input<QuickConnectConfigArgs> quickConnectConfig;

    public Input<QuickConnectConfigArgs> getQuickConnectConfig() {
        return this.quickConnectConfig;
    }

    /**
     * One or more tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<QuickConnectTagArgs>> tags;

    public Input<List<QuickConnectTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public QuickConnectArgs(
        @Nullable Input<String> description,
        Input<String> instanceArn,
        @Nullable Input<String> name,
        Input<QuickConnectConfigArgs> quickConnectConfig,
        @Nullable Input<List<QuickConnectTagArgs>> tags) {
        this.description = description;
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
        this.name = name;
        this.quickConnectConfig = Objects.requireNonNull(quickConnectConfig, "expected parameter 'quickConnectConfig' to be non-null");
        this.tags = tags;
    }

    private QuickConnectArgs() {
        this.description = Input.empty();
        this.instanceArn = Input.empty();
        this.name = Input.empty();
        this.quickConnectConfig = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> instanceArn;
        private @Nullable Input<String> name;
        private Input<QuickConnectConfigArgs> quickConnectConfig;
        private @Nullable Input<List<QuickConnectTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.instanceArn = defaults.instanceArn;
    	      this.name = defaults.name;
    	      this.quickConnectConfig = defaults.quickConnectConfig;
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

        public Builder setInstanceArn(Input<String> instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }

        public Builder setInstanceArn(String instanceArn) {
            this.instanceArn = Input.of(Objects.requireNonNull(instanceArn));
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

        public Builder setQuickConnectConfig(Input<QuickConnectConfigArgs> quickConnectConfig) {
            this.quickConnectConfig = Objects.requireNonNull(quickConnectConfig);
            return this;
        }

        public Builder setQuickConnectConfig(QuickConnectConfigArgs quickConnectConfig) {
            this.quickConnectConfig = Input.of(Objects.requireNonNull(quickConnectConfig));
            return this;
        }

        public Builder setTags(@Nullable Input<List<QuickConnectTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<QuickConnectTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public QuickConnectArgs build() {
            return new QuickConnectArgs(description, instanceArn, name, quickConnectConfig, tags);
        }
    }
}
