// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaOptionsArgs Empty = new CaOptionsArgs();

    @InputImport(name="isCa")
    private final @Nullable Input<Boolean> isCa;

    public Input<Boolean> getIsCa() {
        return this.isCa == null ? Input.empty() : this.isCa;
    }

    @InputImport(name="maxIssuerPathLength")
    private final @Nullable Input<Integer> maxIssuerPathLength;

    public Input<Integer> getMaxIssuerPathLength() {
        return this.maxIssuerPathLength == null ? Input.empty() : this.maxIssuerPathLength;
    }

    public CaOptionsArgs(
        @Nullable Input<Boolean> isCa,
        @Nullable Input<Integer> maxIssuerPathLength) {
        this.isCa = isCa;
        this.maxIssuerPathLength = maxIssuerPathLength;
    }

    private CaOptionsArgs() {
        this.isCa = Input.empty();
        this.maxIssuerPathLength = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isCa;
        private @Nullable Input<Integer> maxIssuerPathLength;

        public Builder() {
    	      // Empty
        }

        public Builder(CaOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCa = defaults.isCa;
    	      this.maxIssuerPathLength = defaults.maxIssuerPathLength;
        }

        public Builder setIsCa(@Nullable Input<Boolean> isCa) {
            this.isCa = isCa;
            return this;
        }

        public Builder setIsCa(@Nullable Boolean isCa) {
            this.isCa = Input.ofNullable(isCa);
            return this;
        }

        public Builder setMaxIssuerPathLength(@Nullable Input<Integer> maxIssuerPathLength) {
            this.maxIssuerPathLength = maxIssuerPathLength;
            return this;
        }

        public Builder setMaxIssuerPathLength(@Nullable Integer maxIssuerPathLength) {
            this.maxIssuerPathLength = Input.ofNullable(maxIssuerPathLength);
            return this;
        }

        public CaOptionsArgs build() {
            return new CaOptionsArgs(isCa, maxIssuerPathLength);
        }
    }
}