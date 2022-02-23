// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.apikeys_v2.inputs.V2AndroidKeyRestrictionsResponse;
import io.pulumi.googlenative.apikeys_v2.inputs.V2ApiTargetResponse;
import io.pulumi.googlenative.apikeys_v2.inputs.V2BrowserKeyRestrictionsResponse;
import io.pulumi.googlenative.apikeys_v2.inputs.V2IosKeyRestrictionsResponse;
import io.pulumi.googlenative.apikeys_v2.inputs.V2ServerKeyRestrictionsResponse;
import java.util.List;
import java.util.Objects;


/**
 * Describes the restrictions on the key.
 * 
 */
public final class V2RestrictionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final V2RestrictionsResponse Empty = new V2RestrictionsResponse();

    /**
     * The Android apps that are allowed to use the key.
     * 
     */
    @InputImport(name="androidKeyRestrictions", required=true)
      private final V2AndroidKeyRestrictionsResponse androidKeyRestrictions;

    public V2AndroidKeyRestrictionsResponse getAndroidKeyRestrictions() {
        return this.androidKeyRestrictions;
    }

    /**
     * A restriction for a specific service and optionally one or more specific methods. Requests are allowed if they match any of these restrictions. If no restrictions are specified, all targets are allowed.
     * 
     */
    @InputImport(name="apiTargets", required=true)
      private final List<V2ApiTargetResponse> apiTargets;

    public List<V2ApiTargetResponse> getApiTargets() {
        return this.apiTargets;
    }

    /**
     * The HTTP referrers (websites) that are allowed to use the key.
     * 
     */
    @InputImport(name="browserKeyRestrictions", required=true)
      private final V2BrowserKeyRestrictionsResponse browserKeyRestrictions;

    public V2BrowserKeyRestrictionsResponse getBrowserKeyRestrictions() {
        return this.browserKeyRestrictions;
    }

    /**
     * The iOS apps that are allowed to use the key.
     * 
     */
    @InputImport(name="iosKeyRestrictions", required=true)
      private final V2IosKeyRestrictionsResponse iosKeyRestrictions;

    public V2IosKeyRestrictionsResponse getIosKeyRestrictions() {
        return this.iosKeyRestrictions;
    }

    /**
     * The IP addresses of callers that are allowed to use the key.
     * 
     */
    @InputImport(name="serverKeyRestrictions", required=true)
      private final V2ServerKeyRestrictionsResponse serverKeyRestrictions;

    public V2ServerKeyRestrictionsResponse getServerKeyRestrictions() {
        return this.serverKeyRestrictions;
    }

    public V2RestrictionsResponse(
        V2AndroidKeyRestrictionsResponse androidKeyRestrictions,
        List<V2ApiTargetResponse> apiTargets,
        V2BrowserKeyRestrictionsResponse browserKeyRestrictions,
        V2IosKeyRestrictionsResponse iosKeyRestrictions,
        V2ServerKeyRestrictionsResponse serverKeyRestrictions) {
        this.androidKeyRestrictions = Objects.requireNonNull(androidKeyRestrictions, "expected parameter 'androidKeyRestrictions' to be non-null");
        this.apiTargets = Objects.requireNonNull(apiTargets, "expected parameter 'apiTargets' to be non-null");
        this.browserKeyRestrictions = Objects.requireNonNull(browserKeyRestrictions, "expected parameter 'browserKeyRestrictions' to be non-null");
        this.iosKeyRestrictions = Objects.requireNonNull(iosKeyRestrictions, "expected parameter 'iosKeyRestrictions' to be non-null");
        this.serverKeyRestrictions = Objects.requireNonNull(serverKeyRestrictions, "expected parameter 'serverKeyRestrictions' to be non-null");
    }

    private V2RestrictionsResponse() {
        this.androidKeyRestrictions = null;
        this.apiTargets = List.of();
        this.browserKeyRestrictions = null;
        this.iosKeyRestrictions = null;
        this.serverKeyRestrictions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2RestrictionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2AndroidKeyRestrictionsResponse androidKeyRestrictions;
        private List<V2ApiTargetResponse> apiTargets;
        private V2BrowserKeyRestrictionsResponse browserKeyRestrictions;
        private V2IosKeyRestrictionsResponse iosKeyRestrictions;
        private V2ServerKeyRestrictionsResponse serverKeyRestrictions;

        public Builder() {
    	      // Empty
        }

        public Builder(V2RestrictionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidKeyRestrictions = defaults.androidKeyRestrictions;
    	      this.apiTargets = defaults.apiTargets;
    	      this.browserKeyRestrictions = defaults.browserKeyRestrictions;
    	      this.iosKeyRestrictions = defaults.iosKeyRestrictions;
    	      this.serverKeyRestrictions = defaults.serverKeyRestrictions;
        }

        public Builder setAndroidKeyRestrictions(V2AndroidKeyRestrictionsResponse androidKeyRestrictions) {
            this.androidKeyRestrictions = Objects.requireNonNull(androidKeyRestrictions);
            return this;
        }

        public Builder setApiTargets(List<V2ApiTargetResponse> apiTargets) {
            this.apiTargets = Objects.requireNonNull(apiTargets);
            return this;
        }

        public Builder setBrowserKeyRestrictions(V2BrowserKeyRestrictionsResponse browserKeyRestrictions) {
            this.browserKeyRestrictions = Objects.requireNonNull(browserKeyRestrictions);
            return this;
        }

        public Builder setIosKeyRestrictions(V2IosKeyRestrictionsResponse iosKeyRestrictions) {
            this.iosKeyRestrictions = Objects.requireNonNull(iosKeyRestrictions);
            return this;
        }

        public Builder setServerKeyRestrictions(V2ServerKeyRestrictionsResponse serverKeyRestrictions) {
            this.serverKeyRestrictions = Objects.requireNonNull(serverKeyRestrictions);
            return this;
        }
        public V2RestrictionsResponse build() {
            return new V2RestrictionsResponse(androidKeyRestrictions, apiTargets, browserKeyRestrictions, iosKeyRestrictions, serverKeyRestrictions);
        }
    }
}
