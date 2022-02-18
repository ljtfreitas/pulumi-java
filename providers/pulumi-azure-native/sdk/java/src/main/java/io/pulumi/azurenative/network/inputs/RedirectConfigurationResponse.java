// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes Redirect Route.
 * 
 */
public final class RedirectConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final RedirectConfigurationResponse Empty = new RedirectConfigurationResponse();

    /**
     * Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
     * 
     */
    @InputImport(name="customFragment")
    private final @Nullable String customFragment;

    public Optional<String> getCustomFragment() {
        return this.customFragment == null ? Optional.empty() : Optional.ofNullable(this.customFragment);
    }

    /**
     * Host to redirect. Leave empty to use the incoming host as the destination host.
     * 
     */
    @InputImport(name="customHost")
    private final @Nullable String customHost;

    public Optional<String> getCustomHost() {
        return this.customHost == null ? Optional.empty() : Optional.ofNullable(this.customHost);
    }

    /**
     * The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as destination path.
     * 
     */
    @InputImport(name="customPath")
    private final @Nullable String customPath;

    public Optional<String> getCustomPath() {
        return this.customPath == null ? Optional.empty() : Optional.ofNullable(this.customPath);
    }

    /**
     * The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query string; leave empty to preserve the incoming query string. Query string must be in <key>=<value> format. The first ? and & will be added automatically so do not include them in the front, but do separate multiple query strings with &.
     * 
     */
    @InputImport(name="customQueryString")
    private final @Nullable String customQueryString;

    public Optional<String> getCustomQueryString() {
        return this.customQueryString == null ? Optional.empty() : Optional.ofNullable(this.customQueryString);
    }

    /**
     * Expected value is '#Microsoft.Azure.FrontDoor.Models.FrontdoorRedirectConfiguration'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * The protocol of the destination to where the traffic is redirected
     * 
     */
    @InputImport(name="redirectProtocol")
    private final @Nullable String redirectProtocol;

    public Optional<String> getRedirectProtocol() {
        return this.redirectProtocol == null ? Optional.empty() : Optional.ofNullable(this.redirectProtocol);
    }

    /**
     * The redirect type the rule will use when redirecting traffic.
     * 
     */
    @InputImport(name="redirectType")
    private final @Nullable String redirectType;

    public Optional<String> getRedirectType() {
        return this.redirectType == null ? Optional.empty() : Optional.ofNullable(this.redirectType);
    }

    public RedirectConfigurationResponse(
        @Nullable String customFragment,
        @Nullable String customHost,
        @Nullable String customPath,
        @Nullable String customQueryString,
        String odataType,
        @Nullable String redirectProtocol,
        @Nullable String redirectType) {
        this.customFragment = customFragment;
        this.customHost = customHost;
        this.customPath = customPath;
        this.customQueryString = customQueryString;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.redirectProtocol = redirectProtocol;
        this.redirectType = redirectType;
    }

    private RedirectConfigurationResponse() {
        this.customFragment = null;
        this.customHost = null;
        this.customPath = null;
        this.customQueryString = null;
        this.odataType = null;
        this.redirectProtocol = null;
        this.redirectType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedirectConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customFragment;
        private @Nullable String customHost;
        private @Nullable String customPath;
        private @Nullable String customQueryString;
        private String odataType;
        private @Nullable String redirectProtocol;
        private @Nullable String redirectType;

        public Builder() {
    	      // Empty
        }

        public Builder(RedirectConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFragment = defaults.customFragment;
    	      this.customHost = defaults.customHost;
    	      this.customPath = defaults.customPath;
    	      this.customQueryString = defaults.customQueryString;
    	      this.odataType = defaults.odataType;
    	      this.redirectProtocol = defaults.redirectProtocol;
    	      this.redirectType = defaults.redirectType;
        }

        public Builder setCustomFragment(@Nullable String customFragment) {
            this.customFragment = customFragment;
            return this;
        }

        public Builder setCustomHost(@Nullable String customHost) {
            this.customHost = customHost;
            return this;
        }

        public Builder setCustomPath(@Nullable String customPath) {
            this.customPath = customPath;
            return this;
        }

        public Builder setCustomQueryString(@Nullable String customQueryString) {
            this.customQueryString = customQueryString;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setRedirectProtocol(@Nullable String redirectProtocol) {
            this.redirectProtocol = redirectProtocol;
            return this;
        }

        public Builder setRedirectType(@Nullable String redirectType) {
            this.redirectType = redirectType;
            return this;
        }

        public RedirectConfigurationResponse build() {
            return new RedirectConfigurationResponse(customFragment, customHost, customPath, customQueryString, odataType, redirectProtocol, redirectType);
        }
    }
}
