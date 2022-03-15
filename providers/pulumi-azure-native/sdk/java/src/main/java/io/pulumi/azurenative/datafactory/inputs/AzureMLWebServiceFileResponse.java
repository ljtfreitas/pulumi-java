// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;


/**
 * Azure ML WebService Input/Output file
 * 
 */
public final class AzureMLWebServiceFileResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureMLWebServiceFileResponse Empty = new AzureMLWebServiceFileResponse();

    /**
     * The relative file path, including container name, in the Azure Blob Storage specified by the LinkedService. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="filePath", required=true)
      private final Object filePath;

    public Object getFilePath() {
        return this.filePath;
    }

    /**
     * Reference to an Azure Storage LinkedService, where Azure ML WebService Input/Output file located.
     * 
     */
    @Import(name="linkedServiceName", required=true)
      private final LinkedServiceReferenceResponse linkedServiceName;

    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }

    public AzureMLWebServiceFileResponse(
        Object filePath,
        LinkedServiceReferenceResponse linkedServiceName) {
        this.filePath = Objects.requireNonNull(filePath, "expected parameter 'filePath' to be non-null");
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
    }

    private AzureMLWebServiceFileResponse() {
        this.filePath = null;
        this.linkedServiceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLWebServiceFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object filePath;
        private LinkedServiceReferenceResponse linkedServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLWebServiceFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePath = defaults.filePath;
    	      this.linkedServiceName = defaults.linkedServiceName;
        }

        public Builder filePath(Object filePath) {
            this.filePath = Objects.requireNonNull(filePath);
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public AzureMLWebServiceFileResponse build() {
            return new AzureMLWebServiceFileResponse(filePath, linkedServiceName);
        }
    }
}
