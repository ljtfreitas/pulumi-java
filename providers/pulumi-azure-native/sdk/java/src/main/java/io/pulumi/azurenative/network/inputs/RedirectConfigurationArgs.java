// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FrontDoorRedirectProtocol;
import io.pulumi.azurenative.network.enums.FrontDoorRedirectType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes Redirect Route.
 * 
 */
public final class RedirectConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RedirectConfigurationArgs Empty = new RedirectConfigurationArgs();

    /**
     * Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
     * 
     */
    @Import(name="customFragment")
      private final @Nullable Output<String> customFragment;

    public Output<String> getCustomFragment() {
        return this.customFragment == null ? Output.empty() : this.customFragment;
    }

    /**
     * Host to redirect. Leave empty to use the incoming host as the destination host.
     * 
     */
    @Import(name="customHost")
      private final @Nullable Output<String> customHost;

    public Output<String> getCustomHost() {
        return this.customHost == null ? Output.empty() : this.customHost;
    }

    /**
     * The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as destination path.
     * 
     */
    @Import(name="customPath")
      private final @Nullable Output<String> customPath;

    public Output<String> getCustomPath() {
        return this.customPath == null ? Output.empty() : this.customPath;
    }

    /**
     * The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query string; leave empty to preserve the incoming query string. Query string must be in <key>=<value> format. The first ? and & will be added automatically so do not include them in the front, but do separate multiple query strings with &.
     * 
     */
    @Import(name="customQueryString")
      private final @Nullable Output<String> customQueryString;

    public Output<String> getCustomQueryString() {
        return this.customQueryString == null ? Output.empty() : this.customQueryString;
    }

    /**
     * Expected value is '#Microsoft.Azure.FrontDoor.Models.FrontdoorRedirectConfiguration'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The protocol of the destination to where the traffic is redirected
     * 
     */
    @Import(name="redirectProtocol")
      private final @Nullable Output<Either<String,FrontDoorRedirectProtocol>> redirectProtocol;

    public Output<Either<String,FrontDoorRedirectProtocol>> getRedirectProtocol() {
        return this.redirectProtocol == null ? Output.empty() : this.redirectProtocol;
    }

    /**
     * The redirect type the rule will use when redirecting traffic.
     * 
     */
    @Import(name="redirectType")
      private final @Nullable Output<Either<String,FrontDoorRedirectType>> redirectType;

    public Output<Either<String,FrontDoorRedirectType>> getRedirectType() {
        return this.redirectType == null ? Output.empty() : this.redirectType;
    }

    public RedirectConfigurationArgs(
        @Nullable Output<String> customFragment,
        @Nullable Output<String> customHost,
        @Nullable Output<String> customPath,
        @Nullable Output<String> customQueryString,
        Output<String> odataType,
        @Nullable Output<Either<String,FrontDoorRedirectProtocol>> redirectProtocol,
        @Nullable Output<Either<String,FrontDoorRedirectType>> redirectType) {
        this.customFragment = customFragment;
        this.customHost = customHost;
        this.customPath = customPath;
        this.customQueryString = customQueryString;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.redirectProtocol = redirectProtocol;
        this.redirectType = redirectType;
    }

    private RedirectConfigurationArgs() {
        this.customFragment = Output.empty();
        this.customHost = Output.empty();
        this.customPath = Output.empty();
        this.customQueryString = Output.empty();
        this.odataType = Output.empty();
        this.redirectProtocol = Output.empty();
        this.redirectType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedirectConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> customFragment;
        private @Nullable Output<String> customHost;
        private @Nullable Output<String> customPath;
        private @Nullable Output<String> customQueryString;
        private Output<String> odataType;
        private @Nullable Output<Either<String,FrontDoorRedirectProtocol>> redirectProtocol;
        private @Nullable Output<Either<String,FrontDoorRedirectType>> redirectType;

        public Builder() {
    	      // Empty
        }

        public Builder(RedirectConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFragment = defaults.customFragment;
    	      this.customHost = defaults.customHost;
    	      this.customPath = defaults.customPath;
    	      this.customQueryString = defaults.customQueryString;
    	      this.odataType = defaults.odataType;
    	      this.redirectProtocol = defaults.redirectProtocol;
    	      this.redirectType = defaults.redirectType;
        }

        public Builder customFragment(@Nullable Output<String> customFragment) {
            this.customFragment = customFragment;
            return this;
        }

        public Builder customFragment(@Nullable String customFragment) {
            this.customFragment = Output.ofNullable(customFragment);
            return this;
        }

        public Builder customHost(@Nullable Output<String> customHost) {
            this.customHost = customHost;
            return this;
        }

        public Builder customHost(@Nullable String customHost) {
            this.customHost = Output.ofNullable(customHost);
            return this;
        }

        public Builder customPath(@Nullable Output<String> customPath) {
            this.customPath = customPath;
            return this;
        }

        public Builder customPath(@Nullable String customPath) {
            this.customPath = Output.ofNullable(customPath);
            return this;
        }

        public Builder customQueryString(@Nullable Output<String> customQueryString) {
            this.customQueryString = customQueryString;
            return this;
        }

        public Builder customQueryString(@Nullable String customQueryString) {
            this.customQueryString = Output.ofNullable(customQueryString);
            return this;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder redirectProtocol(@Nullable Output<Either<String,FrontDoorRedirectProtocol>> redirectProtocol) {
            this.redirectProtocol = redirectProtocol;
            return this;
        }

        public Builder redirectProtocol(@Nullable Either<String,FrontDoorRedirectProtocol> redirectProtocol) {
            this.redirectProtocol = Output.ofNullable(redirectProtocol);
            return this;
        }

        public Builder redirectType(@Nullable Output<Either<String,FrontDoorRedirectType>> redirectType) {
            this.redirectType = redirectType;
            return this;
        }

        public Builder redirectType(@Nullable Either<String,FrontDoorRedirectType> redirectType) {
            this.redirectType = Output.ofNullable(redirectType);
            return this;
        }
        public RedirectConfigurationArgs build() {
            return new RedirectConfigurationArgs(customFragment, customHost, customPath, customQueryString, odataType, redirectProtocol, redirectType);
        }
    }
}
