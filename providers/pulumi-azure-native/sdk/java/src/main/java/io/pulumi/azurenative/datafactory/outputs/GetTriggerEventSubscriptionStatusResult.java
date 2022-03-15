// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTriggerEventSubscriptionStatusResult {
    /**
     * Event Subscription Status.
     * 
     */
    private final String status;
    /**
     * Trigger name.
     * 
     */
    private final String triggerName;

    @CustomType.Constructor
    private GetTriggerEventSubscriptionStatusResult(
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("triggerName") String triggerName) {
        this.status = status;
        this.triggerName = triggerName;
    }

    /**
     * Event Subscription Status.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Trigger name.
     * 
    */
    public String getTriggerName() {
        return this.triggerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerEventSubscriptionStatusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;
        private String triggerName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTriggerEventSubscriptionStatusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.triggerName = defaults.triggerName;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder triggerName(String triggerName) {
            this.triggerName = Objects.requireNonNull(triggerName);
            return this;
        }
        public GetTriggerEventSubscriptionStatusResult build() {
            return new GetTriggerEventSubscriptionStatusResult(status, triggerName);
        }
    }
}
