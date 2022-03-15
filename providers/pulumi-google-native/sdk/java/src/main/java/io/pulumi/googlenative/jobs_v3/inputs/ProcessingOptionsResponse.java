// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Input only. Options for job processing.
 * 
 */
public final class ProcessingOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProcessingOptionsResponse Empty = new ProcessingOptionsResponse();

    /**
     * Optional. If set to `true`, the service does not attempt to resolve a more precise address for the job.
     * 
     */
    @Import(name="disableStreetAddressResolution", required=true)
      private final Boolean disableStreetAddressResolution;

    public Boolean getDisableStreetAddressResolution() {
        return this.disableStreetAddressResolution;
    }

    /**
     * Optional. Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields may be stripped if sanitiazation is not disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
     * 
     */
    @Import(name="htmlSanitization", required=true)
      private final String htmlSanitization;

    public String getHtmlSanitization() {
        return this.htmlSanitization;
    }

    public ProcessingOptionsResponse(
        Boolean disableStreetAddressResolution,
        String htmlSanitization) {
        this.disableStreetAddressResolution = Objects.requireNonNull(disableStreetAddressResolution, "expected parameter 'disableStreetAddressResolution' to be non-null");
        this.htmlSanitization = Objects.requireNonNull(htmlSanitization, "expected parameter 'htmlSanitization' to be non-null");
    }

    private ProcessingOptionsResponse() {
        this.disableStreetAddressResolution = null;
        this.htmlSanitization = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProcessingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disableStreetAddressResolution;
        private String htmlSanitization;

        public Builder() {
    	      // Empty
        }

        public Builder(ProcessingOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableStreetAddressResolution = defaults.disableStreetAddressResolution;
    	      this.htmlSanitization = defaults.htmlSanitization;
        }

        public Builder disableStreetAddressResolution(Boolean disableStreetAddressResolution) {
            this.disableStreetAddressResolution = Objects.requireNonNull(disableStreetAddressResolution);
            return this;
        }

        public Builder htmlSanitization(String htmlSanitization) {
            this.htmlSanitization = Objects.requireNonNull(htmlSanitization);
            return this;
        }
        public ProcessingOptionsResponse build() {
            return new ProcessingOptionsResponse(disableStreetAddressResolution, htmlSanitization);
        }
    }
}
