// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The start and end date for pulling data for the report.
 * 
 */
public final class ReportTimePeriodArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportTimePeriodArgs Empty = new ReportTimePeriodArgs();

    /**
     * The start date to pull data from.
     * 
     */
    @Import(name="from", required=true)
      private final Output<String> from;

    public Output<String> getFrom() {
        return this.from;
    }

    /**
     * The end date to pull data to.
     * 
     */
    @Import(name="to", required=true)
      private final Output<String> to;

    public Output<String> getTo() {
        return this.to;
    }

    public ReportTimePeriodArgs(
        Output<String> from,
        Output<String> to) {
        this.from = Objects.requireNonNull(from, "expected parameter 'from' to be non-null");
        this.to = Objects.requireNonNull(to, "expected parameter 'to' to be non-null");
    }

    private ReportTimePeriodArgs() {
        this.from = Output.empty();
        this.to = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportTimePeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> from;
        private Output<String> to;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportTimePeriodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        public Builder from(Output<String> from) {
            this.from = Objects.requireNonNull(from);
            return this;
        }

        public Builder from(String from) {
            this.from = Output.of(Objects.requireNonNull(from));
            return this;
        }

        public Builder to(Output<String> to) {
            this.to = Objects.requireNonNull(to);
            return this;
        }

        public Builder to(String to) {
            this.to = Output.of(Objects.requireNonNull(to));
            return this;
        }
        public ReportTimePeriodArgs build() {
            return new ReportTimePeriodArgs(from, to);
        }
    }
}
