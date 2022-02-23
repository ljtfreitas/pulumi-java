// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.InquiryValidationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details of an inquired protectable item.
 * 
 */
public final class WorkloadInquiryDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadInquiryDetailsArgs Empty = new WorkloadInquiryDetailsArgs();

    /**
     * Inquiry validation such as permissions and other backup validations.
     * 
     */
    @InputImport(name="inquiryValidation")
        private final @Nullable Input<InquiryValidationArgs> inquiryValidation;

    public Input<InquiryValidationArgs> getInquiryValidation() {
        return this.inquiryValidation == null ? Input.empty() : this.inquiryValidation;
    }

    /**
     * Contains the protectable item Count inside this Container.
     * 
     */
    @InputImport(name="itemCount")
        private final @Nullable Input<Double> itemCount;

    public Input<Double> getItemCount() {
        return this.itemCount == null ? Input.empty() : this.itemCount;
    }

    /**
     * Type of the Workload such as SQL, Oracle etc.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public WorkloadInquiryDetailsArgs(
        @Nullable Input<InquiryValidationArgs> inquiryValidation,
        @Nullable Input<Double> itemCount,
        @Nullable Input<String> type) {
        this.inquiryValidation = inquiryValidation;
        this.itemCount = itemCount;
        this.type = type;
    }

    private WorkloadInquiryDetailsArgs() {
        this.inquiryValidation = Input.empty();
        this.itemCount = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadInquiryDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InquiryValidationArgs> inquiryValidation;
        private @Nullable Input<Double> itemCount;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadInquiryDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inquiryValidation = defaults.inquiryValidation;
    	      this.itemCount = defaults.itemCount;
    	      this.type = defaults.type;
        }

        public Builder setInquiryValidation(@Nullable Input<InquiryValidationArgs> inquiryValidation) {
            this.inquiryValidation = inquiryValidation;
            return this;
        }

        public Builder setInquiryValidation(@Nullable InquiryValidationArgs inquiryValidation) {
            this.inquiryValidation = Input.ofNullable(inquiryValidation);
            return this;
        }

        public Builder setItemCount(@Nullable Input<Double> itemCount) {
            this.itemCount = itemCount;
            return this;
        }

        public Builder setItemCount(@Nullable Double itemCount) {
            this.itemCount = Input.ofNullable(itemCount);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public WorkloadInquiryDetailsArgs build() {
            return new WorkloadInquiryDetailsArgs(inquiryValidation, itemCount, type);
        }
    }
}
