// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AppInsights credentials.
 * 
 */
public final class AppInsightsCredentialsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AppInsightsCredentialsResponse Empty = new AppInsightsCredentialsResponse();

    /**
     * The AppInsights application ID.
     * 
     */
    @InputImport(name="appId")
    private final @Nullable String appId;

    public Optional<String> getAppId() {
        return this.appId == null ? Optional.empty() : Optional.ofNullable(this.appId);
    }

    /**
     * The AppInsights instrumentation key. This is not returned in response of GET/PUT on the resource. To see this please call listKeys API.
     * 
     */
    @InputImport(name="instrumentationKey")
    private final @Nullable String instrumentationKey;

    public Optional<String> getInstrumentationKey() {
        return this.instrumentationKey == null ? Optional.empty() : Optional.ofNullable(this.instrumentationKey);
    }

    public AppInsightsCredentialsResponse(
        @Nullable String appId,
        @Nullable String instrumentationKey) {
        this.appId = appId;
        this.instrumentationKey = instrumentationKey;
    }

    private AppInsightsCredentialsResponse() {
        this.appId = null;
        this.instrumentationKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppInsightsCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appId;
        private @Nullable String instrumentationKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AppInsightsCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.instrumentationKey = defaults.instrumentationKey;
        }

        public Builder setAppId(@Nullable String appId) {
            this.appId = appId;
            return this;
        }

        public Builder setInstrumentationKey(@Nullable String instrumentationKey) {
            this.instrumentationKey = instrumentationKey;
            return this;
        }

        public AppInsightsCredentialsResponse build() {
            return new AppInsightsCredentialsResponse(appId, instrumentationKey);
        }
    }
}
