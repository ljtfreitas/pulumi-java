// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetNotificationRegistrationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNotificationRegistrationArgs Empty = new GetNotificationRegistrationArgs();

    /**
     * The notification registration.
     * 
     */
    @InputImport(name="notificationRegistrationName", required=true)
        private final String notificationRegistrationName;

    public String getNotificationRegistrationName() {
        return this.notificationRegistrationName;
    }

    /**
     * The name of the resource provider hosted within ProviderHub.
     * 
     */
    @InputImport(name="providerNamespace", required=true)
        private final String providerNamespace;

    public String getProviderNamespace() {
        return this.providerNamespace;
    }

    public GetNotificationRegistrationArgs(
        String notificationRegistrationName,
        String providerNamespace) {
        this.notificationRegistrationName = Objects.requireNonNull(notificationRegistrationName, "expected parameter 'notificationRegistrationName' to be non-null");
        this.providerNamespace = Objects.requireNonNull(providerNamespace, "expected parameter 'providerNamespace' to be non-null");
    }

    private GetNotificationRegistrationArgs() {
        this.notificationRegistrationName = null;
        this.providerNamespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String notificationRegistrationName;
        private String providerNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotificationRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notificationRegistrationName = defaults.notificationRegistrationName;
    	      this.providerNamespace = defaults.providerNamespace;
        }

        public Builder setNotificationRegistrationName(String notificationRegistrationName) {
            this.notificationRegistrationName = Objects.requireNonNull(notificationRegistrationName);
            return this;
        }

        public Builder setProviderNamespace(String providerNamespace) {
            this.providerNamespace = Objects.requireNonNull(providerNamespace);
            return this;
        }
        public GetNotificationRegistrationArgs build() {
            return new GetNotificationRegistrationArgs(notificationRegistrationName, providerNamespace);
        }
    }
}
