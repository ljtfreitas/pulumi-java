// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1.outputs.RevisionTemplateResponse;
import io.pulumi.googlenative.run_v1.outputs.TrafficTargetResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ServiceSpecResponse {
    /**
     * Template holds the latest specification for the Revision to be stamped out.
     * 
     */
    private final RevisionTemplateResponse template;
    /**
     * Traffic specifies how to distribute traffic over a collection of Knative Revisions and Configurations.
     * 
     */
    private final List<TrafficTargetResponse> traffic;

    @OutputCustomType.Constructor({"template","traffic"})
    private ServiceSpecResponse(
        RevisionTemplateResponse template,
        List<TrafficTargetResponse> traffic) {
        this.template = Objects.requireNonNull(template);
        this.traffic = Objects.requireNonNull(traffic);
    }

    /**
     * Template holds the latest specification for the Revision to be stamped out.
     * 
     */
    public RevisionTemplateResponse getTemplate() {
        return this.template;
    }
    /**
     * Traffic specifies how to distribute traffic over a collection of Knative Revisions and Configurations.
     * 
     */
    public List<TrafficTargetResponse> getTraffic() {
        return this.traffic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RevisionTemplateResponse template;
        private List<TrafficTargetResponse> traffic;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.template = defaults.template;
    	      this.traffic = defaults.traffic;
        }

        public Builder setTemplate(RevisionTemplateResponse template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder setTraffic(List<TrafficTargetResponse> traffic) {
            this.traffic = Objects.requireNonNull(traffic);
            return this;
        }
        public ServiceSpecResponse build() {
            return new ServiceSpecResponse(template, traffic);
        }
    }
}
