// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An SMS receiver.
 * 
 */
public final class SmsReceiverResponse extends io.pulumi.resources.InvokeArgs {

    public static final SmsReceiverResponse Empty = new SmsReceiverResponse();

    /**
     * The country code of the SMS receiver.
     * 
     */
    @InputImport(name="countryCode", required=true)
    private final String countryCode;

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * The name of the SMS receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The phone number of the SMS receiver.
     * 
     */
    @InputImport(name="phoneNumber", required=true)
    private final String phoneNumber;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * The status of the receiver.
     * 
     */
    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    public SmsReceiverResponse(
        String countryCode,
        String name,
        String phoneNumber,
        String status) {
        this.countryCode = Objects.requireNonNull(countryCode, "expected parameter 'countryCode' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private SmsReceiverResponse() {
        this.countryCode = null;
        this.name = null;
        this.phoneNumber = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmsReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String countryCode;
        private String name;
        private String phoneNumber;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(SmsReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCode = defaults.countryCode;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.status = defaults.status;
        }

        public Builder setCountryCode(String countryCode) {
            this.countryCode = Objects.requireNonNull(countryCode);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public SmsReceiverResponse build() {
            return new SmsReceiverResponse(countryCode, name, phoneNumber, status);
        }
    }
}
