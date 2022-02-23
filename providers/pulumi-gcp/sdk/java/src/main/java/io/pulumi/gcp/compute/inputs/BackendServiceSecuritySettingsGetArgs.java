// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BackendServiceSecuritySettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceSecuritySettingsGetArgs Empty = new BackendServiceSecuritySettingsGetArgs();

    /**
     * ClientTlsPolicy is a resource that specifies how a client should authenticate
     * connections to backends of a service. This resource itself does not affect
     * configuration unless it is attached to a backend service resource.
     * 
     */
    @InputImport(name="clientTlsPolicy", required=true)
        private final Input<String> clientTlsPolicy;

    public Input<String> getClientTlsPolicy() {
        return this.clientTlsPolicy;
    }

    /**
     * A list of alternate names to verify the subject identity in the certificate.
     * If specified, the client will verify that the server certificate's subject
     * alt name matches one of the specified values.
     * 
     */
    @InputImport(name="subjectAltNames", required=true)
        private final Input<List<String>> subjectAltNames;

    public Input<List<String>> getSubjectAltNames() {
        return this.subjectAltNames;
    }

    public BackendServiceSecuritySettingsGetArgs(
        Input<String> clientTlsPolicy,
        Input<List<String>> subjectAltNames) {
        this.clientTlsPolicy = Objects.requireNonNull(clientTlsPolicy, "expected parameter 'clientTlsPolicy' to be non-null");
        this.subjectAltNames = Objects.requireNonNull(subjectAltNames, "expected parameter 'subjectAltNames' to be non-null");
    }

    private BackendServiceSecuritySettingsGetArgs() {
        this.clientTlsPolicy = Input.empty();
        this.subjectAltNames = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceSecuritySettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clientTlsPolicy;
        private Input<List<String>> subjectAltNames;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceSecuritySettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTlsPolicy = defaults.clientTlsPolicy;
    	      this.subjectAltNames = defaults.subjectAltNames;
        }

        public Builder setClientTlsPolicy(Input<String> clientTlsPolicy) {
            this.clientTlsPolicy = Objects.requireNonNull(clientTlsPolicy);
            return this;
        }

        public Builder setClientTlsPolicy(String clientTlsPolicy) {
            this.clientTlsPolicy = Input.of(Objects.requireNonNull(clientTlsPolicy));
            return this;
        }

        public Builder setSubjectAltNames(Input<List<String>> subjectAltNames) {
            this.subjectAltNames = Objects.requireNonNull(subjectAltNames);
            return this;
        }

        public Builder setSubjectAltNames(List<String> subjectAltNames) {
            this.subjectAltNames = Input.of(Objects.requireNonNull(subjectAltNames));
            return this;
        }
        public BackendServiceSecuritySettingsGetArgs build() {
            return new BackendServiceSecuritySettingsGetArgs(clientTlsPolicy, subjectAltNames);
        }
    }
}
