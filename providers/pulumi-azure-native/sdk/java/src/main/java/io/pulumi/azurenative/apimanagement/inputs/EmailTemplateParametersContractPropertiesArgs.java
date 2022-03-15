// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Email Template Parameter contract.
 * 
 */
public final class EmailTemplateParametersContractPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EmailTemplateParametersContractPropertiesArgs Empty = new EmailTemplateParametersContractPropertiesArgs();

    /**
     * Template parameter description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Template parameter name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Template parameter title.
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Output.empty() : this.title;
    }

    public EmailTemplateParametersContractPropertiesArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> title) {
        this.description = description;
        this.name = name;
        this.title = title;
    }

    private EmailTemplateParametersContractPropertiesArgs() {
        this.description = Output.empty();
        this.name = Output.empty();
        this.title = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailTemplateParametersContractPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailTemplateParametersContractPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.title = defaults.title;
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

        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = Output.ofNullable(title);
            return this;
        }
        public EmailTemplateParametersContractPropertiesArgs build() {
            return new EmailTemplateParametersContractPropertiesArgs(description, name, title);
        }
    }
}
