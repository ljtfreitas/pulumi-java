// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UpstreamTemplateResponse extends io.pulumi.resources.InvokeArgs {

    public static final UpstreamTemplateResponse Empty = new UpstreamTemplateResponse();

    @InputImport(name="categoryPattern")
    private final @Nullable String categoryPattern;

    public Optional<String> getCategoryPattern() {
        return this.categoryPattern == null ? Optional.empty() : Optional.ofNullable(this.categoryPattern);
    }

    @InputImport(name="eventPattern")
    private final @Nullable String eventPattern;

    public Optional<String> getEventPattern() {
        return this.eventPattern == null ? Optional.empty() : Optional.ofNullable(this.eventPattern);
    }

    @InputImport(name="hubPattern")
    private final @Nullable String hubPattern;

    public Optional<String> getHubPattern() {
        return this.hubPattern == null ? Optional.empty() : Optional.ofNullable(this.hubPattern);
    }

    @InputImport(name="urlTemplate", required=true)
    private final String urlTemplate;

    public String getUrlTemplate() {
        return this.urlTemplate;
    }

    public UpstreamTemplateResponse(
        @Nullable String categoryPattern,
        @Nullable String eventPattern,
        @Nullable String hubPattern,
        String urlTemplate) {
        this.categoryPattern = categoryPattern;
        this.eventPattern = eventPattern;
        this.hubPattern = hubPattern;
        this.urlTemplate = Objects.requireNonNull(urlTemplate, "expected parameter 'urlTemplate' to be non-null");
    }

    private UpstreamTemplateResponse() {
        this.categoryPattern = null;
        this.eventPattern = null;
        this.hubPattern = null;
        this.urlTemplate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpstreamTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String categoryPattern;
        private @Nullable String eventPattern;
        private @Nullable String hubPattern;
        private String urlTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(UpstreamTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoryPattern = defaults.categoryPattern;
    	      this.eventPattern = defaults.eventPattern;
    	      this.hubPattern = defaults.hubPattern;
    	      this.urlTemplate = defaults.urlTemplate;
        }

        public Builder setCategoryPattern(@Nullable String categoryPattern) {
            this.categoryPattern = categoryPattern;
            return this;
        }

        public Builder setEventPattern(@Nullable String eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }

        public Builder setHubPattern(@Nullable String hubPattern) {
            this.hubPattern = hubPattern;
            return this;
        }

        public Builder setUrlTemplate(String urlTemplate) {
            this.urlTemplate = Objects.requireNonNull(urlTemplate);
            return this;
        }

        public UpstreamTemplateResponse build() {
            return new UpstreamTemplateResponse(categoryPattern, eventPattern, hubPattern, urlTemplate);
        }
    }
}