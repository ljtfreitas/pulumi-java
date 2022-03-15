// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationInstanceManifestPayloadArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationInstanceManifestPayloadArgs Empty = new ApplicationInstanceManifestPayloadArgs();

    @Import(name="payloadData")
      private final @Nullable Output<String> payloadData;

    public Output<String> getPayloadData() {
        return this.payloadData == null ? Output.empty() : this.payloadData;
    }

    public ApplicationInstanceManifestPayloadArgs(@Nullable Output<String> payloadData) {
        this.payloadData = payloadData;
    }

    private ApplicationInstanceManifestPayloadArgs() {
        this.payloadData = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInstanceManifestPayloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> payloadData;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInstanceManifestPayloadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payloadData = defaults.payloadData;
        }

        public Builder payloadData(@Nullable Output<String> payloadData) {
            this.payloadData = payloadData;
            return this;
        }

        public Builder payloadData(@Nullable String payloadData) {
            this.payloadData = Output.ofNullable(payloadData);
            return this;
        }
        public ApplicationInstanceManifestPayloadArgs build() {
            return new ApplicationInstanceManifestPayloadArgs(payloadData);
        }
    }
}
