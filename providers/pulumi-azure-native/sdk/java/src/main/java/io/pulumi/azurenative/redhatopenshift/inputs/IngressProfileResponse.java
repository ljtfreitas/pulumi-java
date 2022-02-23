// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IngressProfile represents an ingress profile.
 * 
 */
public final class IngressProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final IngressProfileResponse Empty = new IngressProfileResponse();

    /**
     * The IP of the ingress (immutable).
     * 
     */
    @InputImport(name="ip")
        private final @Nullable String ip;

    public Optional<String> getIp() {
        return this.ip == null ? Optional.empty() : Optional.ofNullable(this.ip);
    }

    /**
     * The ingress profile name.  Must be "default" (immutable).
     * 
     */
    @InputImport(name="name")
        private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Ingress visibility (immutable).
     * 
     */
    @InputImport(name="visibility")
        private final @Nullable String visibility;

    public Optional<String> getVisibility() {
        return this.visibility == null ? Optional.empty() : Optional.ofNullable(this.visibility);
    }

    public IngressProfileResponse(
        @Nullable String ip,
        @Nullable String name,
        @Nullable String visibility) {
        this.ip = ip;
        this.name = name;
        this.visibility = visibility;
    }

    private IngressProfileResponse() {
        this.ip = null;
        this.name = null;
        this.visibility = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ip;
        private @Nullable String name;
        private @Nullable String visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.name = defaults.name;
    	      this.visibility = defaults.visibility;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = ip;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setVisibility(@Nullable String visibility) {
            this.visibility = visibility;
            return this;
        }
        public IngressProfileResponse build() {
            return new IngressProfileResponse(ip, name, visibility);
        }
    }
}
