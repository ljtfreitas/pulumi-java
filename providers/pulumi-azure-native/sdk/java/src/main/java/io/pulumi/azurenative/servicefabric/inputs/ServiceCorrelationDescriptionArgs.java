// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.enums.ServiceCorrelationScheme;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Creates a particular correlation between services.
 * 
 */
public final class ServiceCorrelationDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceCorrelationDescriptionArgs Empty = new ServiceCorrelationDescriptionArgs();

    /**
     * The ServiceCorrelationScheme which describes the relationship between this service and the service specified via ServiceName.
     * 
     */
    @Import(name="scheme", required=true)
      private final Output<Either<String,ServiceCorrelationScheme>> scheme;

    public Output<Either<String,ServiceCorrelationScheme>> getScheme() {
        return this.scheme;
    }

    /**
     * The name of the service that the correlation relationship is established with.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    public ServiceCorrelationDescriptionArgs(
        Output<Either<String,ServiceCorrelationScheme>> scheme,
        Output<String> serviceName) {
        this.scheme = Objects.requireNonNull(scheme, "expected parameter 'scheme' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ServiceCorrelationDescriptionArgs() {
        this.scheme = Output.empty();
        this.serviceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCorrelationDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,ServiceCorrelationScheme>> scheme;
        private Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCorrelationDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheme = defaults.scheme;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder scheme(Output<Either<String,ServiceCorrelationScheme>> scheme) {
            this.scheme = Objects.requireNonNull(scheme);
            return this;
        }

        public Builder scheme(Either<String,ServiceCorrelationScheme> scheme) {
            this.scheme = Output.of(Objects.requireNonNull(scheme));
            return this;
        }

        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public ServiceCorrelationDescriptionArgs build() {
            return new ServiceCorrelationDescriptionArgs(scheme, serviceName);
        }
    }
}
