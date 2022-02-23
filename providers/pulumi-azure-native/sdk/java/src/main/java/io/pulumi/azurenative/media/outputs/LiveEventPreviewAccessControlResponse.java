// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.IPAccessControlResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LiveEventPreviewAccessControlResponse {
    /**
     * The IP access control properties.
     * 
     */
    private final @Nullable IPAccessControlResponse ip;

    @OutputCustomType.Constructor({"ip"})
    private LiveEventPreviewAccessControlResponse(@Nullable IPAccessControlResponse ip) {
        this.ip = ip;
    }

    /**
     * The IP access control properties.
     * 
     */
    public Optional<IPAccessControlResponse> getIp() {
        return Optional.ofNullable(this.ip);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventPreviewAccessControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IPAccessControlResponse ip;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventPreviewAccessControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
        }

        public Builder setIp(@Nullable IPAccessControlResponse ip) {
            this.ip = ip;
            return this;
        }
        public LiveEventPreviewAccessControlResponse build() {
            return new LiveEventPreviewAccessControlResponse(ip);
        }
    }
}
