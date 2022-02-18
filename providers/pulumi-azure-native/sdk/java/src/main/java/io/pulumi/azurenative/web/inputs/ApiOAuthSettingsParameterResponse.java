// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * OAuth settings for the API
 * 
 */
public final class ApiOAuthSettingsParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiOAuthSettingsParameterResponse Empty = new ApiOAuthSettingsParameterResponse();

    /**
     * Options available to this parameter
     * 
     */
    @InputImport(name="options")
    private final @Nullable Object options;

    public Optional<Object> getOptions() {
        return this.options == null ? Optional.empty() : Optional.ofNullable(this.options);
    }

    /**
     * UI definitions per culture as caller can specify the culture
     * 
     */
    @InputImport(name="uiDefinition")
    private final @Nullable Object uiDefinition;

    public Optional<Object> getUiDefinition() {
        return this.uiDefinition == null ? Optional.empty() : Optional.ofNullable(this.uiDefinition);
    }

    /**
     * Value of the setting
     * 
     */
    @InputImport(name="value")
    private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public ApiOAuthSettingsParameterResponse(
        @Nullable Object options,
        @Nullable Object uiDefinition,
        @Nullable String value) {
        this.options = options;
        this.uiDefinition = uiDefinition;
        this.value = value;
    }

    private ApiOAuthSettingsParameterResponse() {
        this.options = null;
        this.uiDefinition = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiOAuthSettingsParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object options;
        private @Nullable Object uiDefinition;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiOAuthSettingsParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.options = defaults.options;
    	      this.uiDefinition = defaults.uiDefinition;
    	      this.value = defaults.value;
        }

        public Builder setOptions(@Nullable Object options) {
            this.options = options;
            return this;
        }

        public Builder setUiDefinition(@Nullable Object uiDefinition) {
            this.uiDefinition = uiDefinition;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public ApiOAuthSettingsParameterResponse build() {
            return new ApiOAuthSettingsParameterResponse(options, uiDefinition, value);
        }
    }
}
