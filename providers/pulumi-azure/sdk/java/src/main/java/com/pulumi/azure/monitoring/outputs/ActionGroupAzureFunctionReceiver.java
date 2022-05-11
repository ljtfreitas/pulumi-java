// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActionGroupAzureFunctionReceiver {
    /**
     * @return The Azure resource ID of the function app.
     * 
     */
    private final String functionAppResourceId;
    /**
     * @return The function name in the function app.
     * 
     */
    private final String functionName;
    /**
     * @return The HTTP trigger url where HTTP request sent to.
     * 
     */
    private final String httpTriggerUrl;
    /**
     * @return The name of the Azure Function receiver.
     * 
     */
    private final String name;
    /**
     * @return Enables or disables the common alert schema.
     * 
     */
    private final @Nullable Boolean useCommonAlertSchema;

    @CustomType.Constructor
    private ActionGroupAzureFunctionReceiver(
        @CustomType.Parameter("functionAppResourceId") String functionAppResourceId,
        @CustomType.Parameter("functionName") String functionName,
        @CustomType.Parameter("httpTriggerUrl") String httpTriggerUrl,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("useCommonAlertSchema") @Nullable Boolean useCommonAlertSchema) {
        this.functionAppResourceId = functionAppResourceId;
        this.functionName = functionName;
        this.httpTriggerUrl = httpTriggerUrl;
        this.name = name;
        this.useCommonAlertSchema = useCommonAlertSchema;
    }

    /**
     * @return The Azure resource ID of the function app.
     * 
     */
    public String functionAppResourceId() {
        return this.functionAppResourceId;
    }
    /**
     * @return The function name in the function app.
     * 
     */
    public String functionName() {
        return this.functionName;
    }
    /**
     * @return The HTTP trigger url where HTTP request sent to.
     * 
     */
    public String httpTriggerUrl() {
        return this.httpTriggerUrl;
    }
    /**
     * @return The name of the Azure Function receiver.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Enables or disables the common alert schema.
     * 
     */
    public Optional<Boolean> useCommonAlertSchema() {
        return Optional.ofNullable(this.useCommonAlertSchema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionGroupAzureFunctionReceiver defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionAppResourceId;
        private String functionName;
        private String httpTriggerUrl;
        private String name;
        private @Nullable Boolean useCommonAlertSchema;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionGroupAzureFunctionReceiver defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionAppResourceId = defaults.functionAppResourceId;
    	      this.functionName = defaults.functionName;
    	      this.httpTriggerUrl = defaults.httpTriggerUrl;
    	      this.name = defaults.name;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        public Builder functionAppResourceId(String functionAppResourceId) {
            this.functionAppResourceId = Objects.requireNonNull(functionAppResourceId);
            return this;
        }
        public Builder functionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }
        public Builder httpTriggerUrl(String httpTriggerUrl) {
            this.httpTriggerUrl = Objects.requireNonNull(httpTriggerUrl);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder useCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }        public ActionGroupAzureFunctionReceiver build() {
            return new ActionGroupAzureFunctionReceiver(functionAppResourceId, functionName, httpTriggerUrl, name, useCommonAlertSchema);
        }
    }
}
