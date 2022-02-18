// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IngressProfile represents an ingress profile.
 * 
 */
public final class IngressProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final IngressProfileArgs Empty = new IngressProfileArgs();

    /**
     * The IP of the ingress (immutable).
     * 
     */
    @InputImport(name="ip")
    private final @Nullable Input<String> ip;

    public Input<String> getIp() {
        return this.ip == null ? Input.empty() : this.ip;
    }

    /**
     * The ingress profile name.  Must be "default" (immutable).
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Ingress visibility (immutable).
     * 
     */
    @InputImport(name="visibility")
    private final @Nullable Input<String> visibility;

    public Input<String> getVisibility() {
        return this.visibility == null ? Input.empty() : this.visibility;
    }

    public IngressProfileArgs(
        @Nullable Input<String> ip,
        @Nullable Input<String> name,
        @Nullable Input<String> visibility) {
        this.ip = ip;
        this.name = name;
        this.visibility = visibility;
    }

    private IngressProfileArgs() {
        this.ip = Input.empty();
        this.name = Input.empty();
        this.visibility = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ip;
        private @Nullable Input<String> name;
        private @Nullable Input<String> visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.name = defaults.name;
    	      this.visibility = defaults.visibility;
        }

        public Builder setIp(@Nullable Input<String> ip) {
            this.ip = ip;
            return this;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = Input.ofNullable(ip);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setVisibility(@Nullable Input<String> visibility) {
            this.visibility = visibility;
            return this;
        }

        public Builder setVisibility(@Nullable String visibility) {
            this.visibility = Input.ofNullable(visibility);
            return this;
        }

        public IngressProfileArgs build() {
            return new IngressProfileArgs(ip, name, visibility);
        }
    }
}
