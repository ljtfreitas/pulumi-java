// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ReceiptRuleAddHeaderActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleAddHeaderActionGetArgs Empty = new ReceiptRuleAddHeaderActionGetArgs();

    /**
     * The name of the header to add
     * 
     */
    @Import(name="headerName", required=true)
      private final Output<String> headerName;

    public Output<String> getHeaderName() {
        return this.headerName;
    }

    /**
     * The value of the header to add
     * 
     */
    @Import(name="headerValue", required=true)
      private final Output<String> headerValue;

    public Output<String> getHeaderValue() {
        return this.headerValue;
    }

    /**
     * The position of the action in the receipt rule
     * 
     */
    @Import(name="position", required=true)
      private final Output<Integer> position;

    public Output<Integer> getPosition() {
        return this.position;
    }

    public ReceiptRuleAddHeaderActionGetArgs(
        Output<String> headerName,
        Output<String> headerValue,
        Output<Integer> position) {
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.headerValue = Objects.requireNonNull(headerValue, "expected parameter 'headerValue' to be non-null");
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
    }

    private ReceiptRuleAddHeaderActionGetArgs() {
        this.headerName = Output.empty();
        this.headerValue = Output.empty();
        this.position = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleAddHeaderActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> headerName;
        private Output<String> headerValue;
        private Output<Integer> position;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleAddHeaderActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.position = defaults.position;
        }

        public Builder headerName(Output<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder headerName(String headerName) {
            this.headerName = Output.of(Objects.requireNonNull(headerName));
            return this;
        }

        public Builder headerValue(Output<String> headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }

        public Builder headerValue(String headerValue) {
            this.headerValue = Output.of(Objects.requireNonNull(headerValue));
            return this;
        }

        public Builder position(Output<Integer> position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder position(Integer position) {
            this.position = Output.of(Objects.requireNonNull(position));
            return this;
        }
        public ReceiptRuleAddHeaderActionGetArgs build() {
            return new ReceiptRuleAddHeaderActionGetArgs(headerName, headerValue, position);
        }
    }
}
