// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListNotebookKeysResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final ListNotebookKeysResultResponse Empty = new ListNotebookKeysResultResponse();

    @InputImport(name="primaryAccessKey", required=true)
    private final String primaryAccessKey;

    public String getPrimaryAccessKey() {
        return this.primaryAccessKey;
    }

    @InputImport(name="secondaryAccessKey", required=true)
    private final String secondaryAccessKey;

    public String getSecondaryAccessKey() {
        return this.secondaryAccessKey;
    }

    public ListNotebookKeysResultResponse(
        String primaryAccessKey,
        String secondaryAccessKey) {
        this.primaryAccessKey = Objects.requireNonNull(primaryAccessKey, "expected parameter 'primaryAccessKey' to be non-null");
        this.secondaryAccessKey = Objects.requireNonNull(secondaryAccessKey, "expected parameter 'secondaryAccessKey' to be non-null");
    }

    private ListNotebookKeysResultResponse() {
        this.primaryAccessKey = null;
        this.secondaryAccessKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListNotebookKeysResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String primaryAccessKey;
        private String secondaryAccessKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListNotebookKeysResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryAccessKey = defaults.primaryAccessKey;
    	      this.secondaryAccessKey = defaults.secondaryAccessKey;
        }

        public Builder setPrimaryAccessKey(String primaryAccessKey) {
            this.primaryAccessKey = Objects.requireNonNull(primaryAccessKey);
            return this;
        }

        public Builder setSecondaryAccessKey(String secondaryAccessKey) {
            this.secondaryAccessKey = Objects.requireNonNull(secondaryAccessKey);
            return this;
        }

        public ListNotebookKeysResultResponse build() {
            return new ListNotebookKeysResultResponse(primaryAccessKey, secondaryAccessKey);
        }
    }
}
