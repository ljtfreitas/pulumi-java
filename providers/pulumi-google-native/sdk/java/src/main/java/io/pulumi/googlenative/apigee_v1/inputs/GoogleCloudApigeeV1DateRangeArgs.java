// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Date range of the data to export.
 * 
 */
public final class GoogleCloudApigeeV1DateRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1DateRangeArgs Empty = new GoogleCloudApigeeV1DateRangeArgs();

    /**
     * End date (exclusive) of the data to export in the format `yyyy-mm-dd`. The date range ends at 00:00:00 UTC on the end date- which will not be in the output.
     * 
     */
    @Import(name="end", required=true)
      private final Output<String> end;

    public Output<String> getEnd() {
        return this.end;
    }

    /**
     * Start date of the data to export in the format `yyyy-mm-dd`. The date range begins at 00:00:00 UTC on the start date.
     * 
     */
    @Import(name="start", required=true)
      private final Output<String> start;

    public Output<String> getStart() {
        return this.start;
    }

    public GoogleCloudApigeeV1DateRangeArgs(
        Output<String> end,
        Output<String> start) {
        this.end = Objects.requireNonNull(end, "expected parameter 'end' to be non-null");
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
    }

    private GoogleCloudApigeeV1DateRangeArgs() {
        this.end = Output.empty();
        this.start = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1DateRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> end;
        private Output<String> start;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1DateRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder end(Output<String> end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }

        public Builder end(String end) {
            this.end = Output.of(Objects.requireNonNull(end));
            return this;
        }

        public Builder start(Output<String> start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }

        public Builder start(String start) {
            this.start = Output.of(Objects.requireNonNull(start));
            return this;
        }
        public GoogleCloudApigeeV1DateRangeArgs build() {
            return new GoogleCloudApigeeV1DateRangeArgs(end, start);
        }
    }
}
