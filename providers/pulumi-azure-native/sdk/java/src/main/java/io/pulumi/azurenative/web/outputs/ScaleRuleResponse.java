// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.CustomScaleRuleResponse;
import io.pulumi.azurenative.web.outputs.HttpScaleRuleResponse;
import io.pulumi.azurenative.web.outputs.QueueScaleRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScaleRuleResponse {
    /**
     * Azure Queue based scaling.
     * 
     */
    private final @Nullable QueueScaleRuleResponse azureQueue;
    /**
     * Custom scale rule.
     * 
     */
    private final @Nullable CustomScaleRuleResponse custom;
    /**
     * HTTP requests based scaling.
     * 
     */
    private final @Nullable HttpScaleRuleResponse http;
    /**
     * Scale Rule Name
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"azureQueue","custom","http","name"})
    private ScaleRuleResponse(
        @Nullable QueueScaleRuleResponse azureQueue,
        @Nullable CustomScaleRuleResponse custom,
        @Nullable HttpScaleRuleResponse http,
        @Nullable String name) {
        this.azureQueue = azureQueue;
        this.custom = custom;
        this.http = http;
        this.name = name;
    }

    /**
     * Azure Queue based scaling.
     * 
     */
    public Optional<QueueScaleRuleResponse> getAzureQueue() {
        return Optional.ofNullable(this.azureQueue);
    }
    /**
     * Custom scale rule.
     * 
     */
    public Optional<CustomScaleRuleResponse> getCustom() {
        return Optional.ofNullable(this.custom);
    }
    /**
     * HTTP requests based scaling.
     * 
     */
    public Optional<HttpScaleRuleResponse> getHttp() {
        return Optional.ofNullable(this.http);
    }
    /**
     * Scale Rule Name
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable QueueScaleRuleResponse azureQueue;
        private @Nullable CustomScaleRuleResponse custom;
        private @Nullable HttpScaleRuleResponse http;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureQueue = defaults.azureQueue;
    	      this.custom = defaults.custom;
    	      this.http = defaults.http;
    	      this.name = defaults.name;
        }

        public Builder setAzureQueue(@Nullable QueueScaleRuleResponse azureQueue) {
            this.azureQueue = azureQueue;
            return this;
        }

        public Builder setCustom(@Nullable CustomScaleRuleResponse custom) {
            this.custom = custom;
            return this;
        }

        public Builder setHttp(@Nullable HttpScaleRuleResponse http) {
            this.http = http;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public ScaleRuleResponse build() {
            return new ScaleRuleResponse(azureQueue, custom, http, name);
        }
    }
}
