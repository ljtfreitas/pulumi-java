// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AssignmentReportResourceComplianceReasonResponse {
    /**
     * Code for the compliance of the guest configuration assignment resource.
     * 
     */
    private final String code;
    /**
     * Reason for the compliance of the guest configuration assignment resource.
     * 
     */
    private final String phrase;

    @OutputCustomType.Constructor({"code","phrase"})
    private AssignmentReportResourceComplianceReasonResponse(
        String code,
        String phrase) {
        this.code = Objects.requireNonNull(code);
        this.phrase = Objects.requireNonNull(phrase);
    }

    /**
     * Code for the compliance of the guest configuration assignment resource.
     * 
     */
    public String getCode() {
        return this.code;
    }
    /**
     * Reason for the compliance of the guest configuration assignment resource.
     * 
     */
    public String getPhrase() {
        return this.phrase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentReportResourceComplianceReasonResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String phrase;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentReportResourceComplianceReasonResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.phrase = defaults.phrase;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setPhrase(String phrase) {
            this.phrase = Objects.requireNonNull(phrase);
            return this;
        }
        public AssignmentReportResourceComplianceReasonResponse build() {
            return new AssignmentReportResourceComplianceReasonResponse(code, phrase);
        }
    }
}
