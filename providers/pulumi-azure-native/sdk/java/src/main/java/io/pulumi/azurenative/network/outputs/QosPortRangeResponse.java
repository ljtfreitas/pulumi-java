// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class QosPortRangeResponse {
    /**
     * Qos Port Range end.
     * 
     */
    private final @Nullable Integer end;
    /**
     * Qos Port Range start.
     * 
     */
    private final @Nullable Integer start;

    @OutputCustomType.Constructor({"end","start"})
    private QosPortRangeResponse(
        @Nullable Integer end,
        @Nullable Integer start) {
        this.end = end;
        this.start = start;
    }

    /**
     * Qos Port Range end.
     * 
     */
    public Optional<Integer> getEnd() {
        return Optional.ofNullable(this.end);
    }
    /**
     * Qos Port Range start.
     * 
     */
    public Optional<Integer> getStart() {
        return Optional.ofNullable(this.start);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QosPortRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer end;
        private @Nullable Integer start;

        public Builder() {
    	      // Empty
        }

        public Builder(QosPortRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder setEnd(@Nullable Integer end) {
            this.end = end;
            return this;
        }

        public Builder setStart(@Nullable Integer start) {
            this.start = start;
            return this;
        }
        public QosPortRangeResponse build() {
            return new QosPortRangeResponse(end, start);
        }
    }
}
