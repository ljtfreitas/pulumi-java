// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.RealtimeLogConfigEndPoint;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRealtimeLogConfigResult {
    private final @Nullable String arn;
    private final @Nullable List<RealtimeLogConfigEndPoint> endPoints;
    private final @Nullable List<String> fields;
    private final @Nullable Double samplingRate;

    @OutputCustomType.Constructor({"arn","endPoints","fields","samplingRate"})
    private GetRealtimeLogConfigResult(
        @Nullable String arn,
        @Nullable List<RealtimeLogConfigEndPoint> endPoints,
        @Nullable List<String> fields,
        @Nullable Double samplingRate) {
        this.arn = arn;
        this.endPoints = endPoints;
        this.fields = fields;
        this.samplingRate = samplingRate;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public List<RealtimeLogConfigEndPoint> getEndPoints() {
        return this.endPoints == null ? List.of() : this.endPoints;
    }
    public List<String> getFields() {
        return this.fields == null ? List.of() : this.fields;
    }
    public Optional<Double> getSamplingRate() {
        return Optional.ofNullable(this.samplingRate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRealtimeLogConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<RealtimeLogConfigEndPoint> endPoints;
        private @Nullable List<String> fields;
        private @Nullable Double samplingRate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRealtimeLogConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.endPoints = defaults.endPoints;
    	      this.fields = defaults.fields;
    	      this.samplingRate = defaults.samplingRate;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setEndPoints(@Nullable List<RealtimeLogConfigEndPoint> endPoints) {
            this.endPoints = endPoints;
            return this;
        }

        public Builder setFields(@Nullable List<String> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setSamplingRate(@Nullable Double samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }
        public GetRealtimeLogConfigResult build() {
            return new GetRealtimeLogConfigResult(arn, endPoints, fields, samplingRate);
        }
    }
}
